package com.luiizhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luiizhf.service.ExampleService;

@Controller
@RequestMapping("/exampleService")
public class ExampleServiceController {
	
	public static final String EXAMPLE_SERVICE_VIEW = "exampleService";
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_SERVICE_VIEW);
		mav.addObject("people", exampleService.getListPeople());
		return mav;
	}

}
