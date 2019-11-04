package com.stock.controllers;

import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/article")
public class ArticleController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		
		return "articles/index";
	}
	
}
