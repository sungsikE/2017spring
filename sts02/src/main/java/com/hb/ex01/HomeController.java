package com.hb.ex01;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.ex01.model.entity.GuestVo;
import com.hb.ex02.model.GuestDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping(value="/")
	public String home(Model model) throws Exception{
		model.addAttribute("list",guestDao.selectAll());
		return "home";
	}
	
	@RequestMapping(value="/add")
	public void add() {
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) throws Exception{
		guestDao.insertOne(bean);
		return "redirect://";
	}
	@RequestMapping(value="/detail")
	public void detail(@RequestParam("idx") int sabun,Model model) throws Exception{
		model.addAttribute("bean",guestDao.selectOne(sabun)) ;
	}
	@RequestMapping(value="/edit")
	public void edit(@RequestParam("idx") int sabun,Model model) throws Exception{
		model.addAttribute("bean",guestDao.selectOne(sabun)) ;
	}
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam("idx") int sabun) throws Exception {
		guestDao.deleteOne(sabun);
		return "redirect://";
	}
	@RequestMapping(value="/update")
	public String update(@ModelAttribute GuestVo bean) throws Exception {
		guestDao.updateOne(bean);
		return "redirect:/detail?idx="+bean.getSabun();
	}
}
