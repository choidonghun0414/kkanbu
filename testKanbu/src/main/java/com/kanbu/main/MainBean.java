package com.kanbu.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainBean {
	
	@RequestMapping("main.com")
	public String main(){
		return "main";
	}

}
