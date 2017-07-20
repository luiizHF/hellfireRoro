package com.luiizhf.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luiizhf.entity.Course;
import com.luiizhf.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	private static final String COURSE_VIEW = "courses";
	private static final Log LOG = LogFactory.getLog(CourseController.class);
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseService courseService;
	
	@GetMapping("/listcourses")
	public ModelAndView listAllCourses(Model model){
		LOG.info("Call: " + "listAllCourses()");
		ModelAndView mav = new ModelAndView(COURSE_VIEW);
		mav.addObject("course", new Course());
		mav.addObject("courses", courseService.listAllcourse());
		return mav;
		
	}
	
	@PostMapping("/addcourse")
	public String addCourses(@ModelAttribute("Course") Course course){
		LOG.info("Call: " + "listAllCourses()"+" -- Param:"+ course.toString());
		courseService.addCourse(course);
		return "redirect:/courses/listcourses";
		
	}

}
