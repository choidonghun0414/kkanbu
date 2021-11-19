package com.kkanbu.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberBean {
	
	@Autowired
	private MemberDAOInter memberImpl = null;
	
	@Autowired
	private MemberDTO member = null;
	
	@RequestMapping("login.com")
	public String login() throws Exception{
		return "/member/login";
	}
	
	@RequestMapping("loginPro.com")
	public String loginPro(HttpServletRequest request, Model model) throws Exception{
		member.setId(request.getParameter("id"));
		member.setPw(request.getParameter("pw"));
		
		memberImpl.insertMember(member);
		
		model.addAttribute("id", member.getId());
		model.addAttribute("pw", member.getPw());
		
		return "/member/loginPro";
	}
	

}
