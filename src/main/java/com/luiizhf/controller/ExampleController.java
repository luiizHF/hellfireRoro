package com.luiizhf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luiizhf.model.Person;


@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	//primera forma
	@GetMapping("/exampleString")
	public String exampleString(Model model){
		model.addAttribute("person", new Person("Luiiz", 26));
		return EXAMPLE_VIEW;
	}
	//Segunda forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("person", new Person("HellFire", 27));
		return mav;
	}
	
	//forma con listado de plantillas
	@GetMapping("/exampleListado")
	public String exampleListado(Model model){
		model.addAttribute("people", getPeople());
		return EXAMPLE_VIEW;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("Luiiz", 26));
		people.add(new Person("Luiizhf", 26));
		people.add(new Person("LuiizLM", 26));
		people.add(new Person("LuiizMO", 26));
		return people;
	}
}
