package org.simplelogin.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.simplelogin.demo.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user.htm")
public class UserController {
	@RequestMapping(params="method=login")
	public ModelAndView login(@ModelAttribute("user") User user, HttpServletRequest req, HttpServletResponse response){
		System.out.println("userInfo:\t" + user);
		ModelAndView model = new ModelAndView();  
		if(user.getUsername().equals("json")){
			model.setViewName("welcome");
			model.addObject("user", user);  
		}else{
			model.setViewName("error");
		}
		return model;
	}
	
}
