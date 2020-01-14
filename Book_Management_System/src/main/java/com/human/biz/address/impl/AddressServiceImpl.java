package com.human.biz.address.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.biz.address.AddressService;
import com.human.biz.address.AddressVO;
@Service("addressService")
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDAO addressDAO;
	@Override
	public List<AddressVO> selectAddress(AddressVO vo) {
		// TODO Auto-generated method stub
		return addressDAO.selectAddress(vo);
	}

}
