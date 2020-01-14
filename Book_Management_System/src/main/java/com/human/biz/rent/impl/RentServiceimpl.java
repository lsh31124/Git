package com.human.biz.rent.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.rent.RentVO;
import com.human.biz.rent.RentService;
@Service("rentService")
public class RentServiceimpl implements RentService {

	@Autowired
	private RentDAO rentDAO;
	
	@Override
	public void updateReturnDate(RentVO vo) {
		rentDAO.updateReturnDate(vo);
	}

}
