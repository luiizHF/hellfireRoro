package com.luiizhf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	private static final String VIEW_EXAMPLE4 = "404";
	private static final String VIEW_EXAMPLE5 = "500";
	
	@GetMapping("/view")
	public String examplError(Model model){
		return VIEW_EXAMPLE4;
	}
	
	@GetMapping("/view2")
	public String exampleError(Model model){
		return VIEW_EXAMPLE5;
	}
}
