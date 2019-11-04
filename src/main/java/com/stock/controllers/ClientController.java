package com.stock.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.entities.Client;
import com.stock.services.IClientService;

@Controller
@RequestMapping(value = "/client")
public class ClientController {
	
	@Autowired
	private IClientService clientService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		List<Client> clients=clientService.findAll();
		if(clients==null) {
			clients = new ArrayList<Client>();
		}
		
		model.addAttribute("clients", clients);
		
		return "clients/index";
	}
	
}
