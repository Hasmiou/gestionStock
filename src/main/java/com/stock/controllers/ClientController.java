package com.stock.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.stock.entities.Client;
import com.stock.services.IClientService;
import com.stock.services.IFlickrService;

@Controller
@RequestMapping(value = "/client")
public class ClientController {
	
	@Autowired
	private IClientService service;
	
	private IFlickrService flickr;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		List<Client> clients=service.findAll();
		if(clients==null) {
			clients = new ArrayList<Client>();
		}
		
		model.addAttribute("clients", clients);
		
		return "clients/index";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String create(Locale locale, Model model) {
		Client client = new Client();
		
		model.addAttribute("client", client);
		return "clients/new";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Locale locale, Model model, Client client, MultipartFile file) {
		String photoUrl=null;
		
		if(client!=null) {
			if(file!=null && !file.isEmpty()) {
				InputStream stream = null;
				try {
					stream = file.getInputStream();
					photoUrl=flickr.upload(stream, "photo_"+client.getEmail());
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						stream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				client.setPhoto(photoUrl);
			}
		}
		
		
		if(client.getIdClient()!= 0L) {
			service.update(client);
		}else {
			service.save(client);
		}
		
		model.addAttribute("client", client);
		return "redirect:/client/";
	}
	
}
