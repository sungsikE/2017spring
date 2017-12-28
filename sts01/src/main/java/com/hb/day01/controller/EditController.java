package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day01.model.GuestDao;

@Controller
public class EditController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping("/edit.do")
	public String edit(@RequestParam("idx") int sabun, Model model) throws Exception {
		model.addAttribute("bean", guestDao.selectOne(sabun));
		return "edit";
	}
}
