package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day01.model.GuestDao;

@Controller
public class DetailController {
	@Autowired
	GuestDao guestDao;
	
//	@RequestMapping("/detail.do")
//	public ModelAndView execute(HttpServletRequest req,HttpServletResponse resp) throws Exception{
//
//		ModelAndView mav = new ModelAndView();		
//		mav.addObject("bean",guestDao.selectOne(Integer.parseInt(req.getParameter("idx"))));
//		mav.setViewName("detail");
//		return mav;
//	}
	
	@RequestMapping("/detail.do")
	public String detail(@RequestParam("idx") int sabun,HttpServletRequest req) throws Exception {
		req.setAttribute("bean", guestDao.selectOne(sabun));
		return "detail";
	}
}
