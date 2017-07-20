package com.luiizhf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luiizhf.model.Car;
import com.luiizhf.service.EjercicioService;

@Controller
@RequestMapping("/ejercicio")
public class EjercicioController {

	public static final String VIEW_FORM = "ejercicio/exerciseForm";
	public static final String VIEW_RESULT = "ejercicio/exerciseResult";
	
	@Autowired
	@Qualifier("ejercicioService")
	private EjercicioService ejercicioService;
	
	@GetMapping("/exerOne")
	public String exerOne(Model model){
		model.addAttribute("car", new Car());		
		return VIEW_FORM;
		
	}
	
	@PostMapping("/exerTwo")
	public ModelAndView exerTwo (@Valid @ModelAttribute("car") Car car, BindingResult bindingResult){
		ejercicioService.mensaje();
		ModelAndView mav = new ModelAndView();
		if(bindingResult.hasErrors()){
			mav.setViewName(VIEW_FORM);
		}else{
			mav.setViewName(VIEW_RESULT);
			mav.addObject("Car", car);
		}
		return mav;
		
	}
	
}
