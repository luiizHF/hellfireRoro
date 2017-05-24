package com.luiizhf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
	
	private static final String EXAMPLE2_VIEW = "example2";
	//primer metodo 127.0.0.1:8080/example2/request1?nm=luiiz
	//primer metodo 127.0.0.1:8080/example2/request1?nm=hf
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm", required=false, defaultValue = "null") String name){
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("nm_in_model", name);
		return mav;
	}
	
	@GetMapping("/req2")
	public ModelAndView req2(@RequestParam(value="nom") String nombre){
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("otro_valor", nombre);
		return mav;
	}
	
	//segundo metdo 127.0.0.1:8080/example2/request2/luiiz
	//segundo metdo 127.0.0.1:8080/example2/request2/luiiz
	
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name){
		ModelAndView mav = new ModelAndView(EXAMPLE2_VIEW);
		mav.addObject("otro_valor", name);
		return mav;
	}
	
}