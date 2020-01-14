package com.human.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.user.UserService;
import com.human.user.UserVO;
@Service("userService")
public class UserServiceimpl implements UserService {
@Autowired
	private UserDAO userDAO;

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.getUser(vo);
	}

	@Override
	public int confirmID(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.confirmID(vo);
	}

	@Override
	public int insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(vo);
	}

}
