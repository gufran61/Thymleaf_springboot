package com.thymleafPractice.homeController;

import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name", "gufran");
		model.addAttribute("currentdate", new Date());
		System.out.println("inside about handler");
		return "about";
		
		}
}
