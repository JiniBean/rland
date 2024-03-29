package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		
		return "/WEB-INF/view/index.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/bye")
	public String bye() {
		
		return "빠빠이";
	}

}
