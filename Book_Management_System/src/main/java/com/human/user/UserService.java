package com.human.user;


public interface UserService {
	public UserVO getUser(UserVO vo);
	public int confirmID(UserVO vo); 
	public int insertUser(UserVO vo);
}
