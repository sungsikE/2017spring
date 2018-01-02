package com.hb.ex04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex04.service.GuestService;

@Controller
public class GuestSelectController {
	@Autowired
	GuestService guestService;
	
	@RequestMapping(value="/guest/bbs",method=RequestMethod.GET)
	public String List(Model model) throws Exception {
		model.addAttribute("list",guestService.selectAll());
		return "list";
	}
}
