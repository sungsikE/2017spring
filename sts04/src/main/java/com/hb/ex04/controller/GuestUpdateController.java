package com.hb.ex04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex04.model.entity.GuestVo;
import com.hb.ex04.service.GuestService;

@Controller
public class GuestUpdateController {
	@Autowired
	GuestService  guestService;
	
	@RequestMapping(value="/guest/bbs",method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) throws Exception {
//		System.out.println(bean);
		guestService.insertOne(bean);
		return "redirect:/guest/bbs";
	}
}
