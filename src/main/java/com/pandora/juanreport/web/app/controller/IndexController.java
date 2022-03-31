package com.pandora.juanreport.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value={"/index", "/", "/home"}, method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
