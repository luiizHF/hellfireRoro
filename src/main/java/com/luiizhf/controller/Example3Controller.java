package com.luiizhf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.luiizhf.model.Person;
@Controller
@RequestMapping("/example3")
public class Example3Controller {

	private static final Log LOGGER = LogFactory.getLog(Example3Controller.class);
	
	private static final String FORM_VIEW = "form";
	private static final String RESULT_VIEW = "result";
	
	// redirect to view
	/*
	@GetMapping
	public String redirect(){
		return "redirect:/example3/showform";
	}
	*/
	
	//redirect to view second form
	@GetMapping
	public RedirectView redirect(){
		return new RedirectView("/example3/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model){
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBEUG TRACE");
		model.addAttribute("person", new Person());
		//int i = 6/0;
		return FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person person){
		LOGGER.info("METHOD: 'addPerson' --- PARAMS: '"+ person+ "'");
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("person", person);
		LOGGER.info("TEMPLATE: '"+ RESULT_VIEW + "' -- DATA: '" + person + "'");
		return mav;
	}
}
