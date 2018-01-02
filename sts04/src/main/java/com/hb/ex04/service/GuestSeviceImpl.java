package com.hb.ex04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hb.ex04.model.GuestDao;
import com.hb.ex04.model.entity.GuestVo;

@Component(value="guestService")
public class GuestSeviceImpl implements GuestService {
	@Autowired
	GuestDao guestDao;
	

//	public void setGuestDao(GuestDao guestDao) {
//		this.guestDao = guestDao;
//	}
	@Override
	public List<GuestVo> selectAll() throws Exception {
		return guestDao.selectAll();
		 
	}
	@Override
	public void insertOne(GuestVo bean) throws Exception {
		guestDao.insertOne(bean);
	}
}
