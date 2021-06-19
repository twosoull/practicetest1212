package com.javaex.Controller;

import java.util.ResourceBundle.Control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class indexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","Hello Dispatcher");
		mv.setViewName("index");
		System.out.println("hello");
		
		return mv;
	}


}
