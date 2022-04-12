package com.pandora.juanreport.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/app"})
public class IndexController {

	@RequestMapping(value={"/index", "/", "/home"}, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("titulo", "Hola desde Spring Web");
		return "index";
	}
}
