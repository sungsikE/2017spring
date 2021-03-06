package com.hb.day01.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day01.model.GuestDao;
import com.hb.day01.model.entity.GuestVo;

//POZO

@Controller
public class ListController {
	@Autowired
	GuestDao guestDao;

	@RequestMapping("/list.do")
	public ModelAndView execute(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		System.out.println("list test");
		ModelAndView mav = new ModelAndView();		
		mav.addObject("list",guestDao.selectAll());
		mav.setViewName("list");
		return mav;
	}
}
