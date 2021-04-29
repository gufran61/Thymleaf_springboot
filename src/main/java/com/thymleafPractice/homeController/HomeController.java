package com.thymleafPractice.homeController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name", "gufran");
		model.addAttribute("currentdate", new Date());
		System.out.println("inside about handler");
		return "about";

	}

	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		List<String> of = List.of("gufran", "farid", "malik", "fahad");
		model.addAttribute("itr", of);
		return "iterate";
	}

	// handler for conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("conditional handler execute");
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "f");
		List<Integer> list = List.of();
		m.addAttribute("mylist", list);
		return "condition";
	}
	//handler for including fragments
	@GetMapping("/service")
	public String serviceHandler(Model m)
{
		m.addAttribute("title", "i like toeat biryani");
		m.addAttribute("subtitle", LocalDateTime.now().toString());
		return "service";}
//for new about
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutNew";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
