package com.kanbu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kanbu.dto.user.UserDTO;
import com.kanbu.inter.user.UserDAOInter;

@Controller
public class MainController {
	
//  예시	
//	@Autowired
//	private UserDAOInter userImpl = null;
//	
//	@Autowired
//	private UserDTO user = null;
	
	// 매핑할 주소와 페이지 이동할 return 값을 적는다.
	@RequestMapping("main.com")
	public String main() throws Exception{
		return "/main";
	}

	
	
// 	예시	
//	@RequestMapping("login.com")
//	public String login() throws Exception{
//		return "/user/login";
//	}
//	
//	@RequestMapping("loginPro.com")
//	public String loginPro(HttpServletRequest request, Model model) throws Exception{
//		user.setId(request.getParameter("id"));
//		user.setPw(request.getParameter("pw"));
//		
//		userImpl.insertMember(member);
//		
//		model.addAttribute("id", user.getId());
//		model.addAttribute("pw", user.getPw());
//		
//		return "/user/loginPro";
//	}
	

}
