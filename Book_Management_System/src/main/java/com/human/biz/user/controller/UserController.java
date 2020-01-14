package com.human.biz.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.human.biz.address.AddressService;
import com.human.biz.address.AddressVO;
import com.human.user.UserService;
import com.human.user.UserVO;

@Controller
@SessionAttributes("loginUser")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private AddressService addressService;
	
	
	//로그인 처리
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(UserVO vo, Model model) {
		System.out.println("입력 파라미터:"+vo);
		UserVO user = userService.getUser(vo);
		if (user == null) {
			System.out.println("로그인 실패");
			return "user/login";
		} else {
			System.out.println("로그인 성공 기뻐해");
			model.addAttribute("loginUser", user);
			
			return "redirect:index";
		}
		
	}
	//로그인
	@RequestMapping(value="login",method =RequestMethod.GET)
	public String login_view(UserVO vo,Model model) {
	  	return "user/login";
	}
	//로그아웃 되면 다시 로그인 페이지로 이동
	  @RequestMapping(value="logout",method=RequestMethod.GET)
	  public String logout(Model model,HttpServletRequest request) {
		  request.getSession().invalidate();
		  model.addAttribute("loginUser",null);
		  return "user/login";
	  }
	  //회원가입
	  @RequestMapping(value="join_form",method=RequestMethod.GET)
	  public String member_join_form() {
		 return "user/member_join";
	  }
	  //아이디 중복체크
	  @RequestMapping(value="id_check_form",method=RequestMethod.GET)
	  public String idcheck_form(@RequestParam(value="id")String id,Model model) {
		  model.addAttribute("id",id);
		  return "user/idcheck";
	  }
	  //
	  @RequestMapping(value="id_check",method=RequestMethod.POST)
	  public String idcheck(UserVO vo,Model model) {
		  UserVO user =userService.getUser(vo);
		  
		  if(user==null) {
			  model.addAttribute("message",-1);
			  model.addAttribute("id",vo.getId());
		  }else {
			  model.addAttribute("message",1);
			  model.addAttribute("id",vo.getId());
		  }
		  return "user/idcheck";
	  }
	  @RequestMapping(value="member_join",method=RequestMethod.POST)
	  public String member_join(@RequestParam(value="addr1")String addr1,
			  					@RequestParam(value="addr2")String addr2,
			  					UserVO vo,Model model){
		  vo.setAddress(addr1+" "+addr2);
		  userService.insertUser(vo);
		  
		  return "redirect:login";
	  }
	  @RequestMapping(value="find_zip_num",method=RequestMethod.GET)
		public String find_zip_num_form() {
			return "user/findZipNum";
		}
	  @RequestMapping(value="find_zip_num",method=RequestMethod.POST)
	  public String find_zip_num(AddressVO vo,Model model) {
		  System.out.println("동이름:"+vo.getDong());
		  List<AddressVO>addressList=addressService.selectAddress(vo);
		  
		  System.out.println("조회결과:");
		  for(int i=0; i<addressList.size();i++) {
			  System.out.println(addressList.get(i).getZip_num());
		  }
		  model.addAttribute("addressList",addressList);
		  return "user/findZipNum";
	  }
	
	  
}
