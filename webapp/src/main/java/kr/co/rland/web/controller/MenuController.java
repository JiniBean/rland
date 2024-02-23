package kr.co.rland.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.service.MenuService;


@Controller
@RequestMapping("menu")
public class MenuController {
	
	@Autowired //필드 인젝션
	MenuService service;
	
//	@Autowired 바인딩 전후에 뭔가 조치를 해야할 때 
//	public MenuController(MenuService service) {
//		this.service = service;
//	}
//	setter

	@GetMapping("list")
	public String list(Model model) {
		
		String a = "안뇽~~~~";
		model.addAttribute("a", a);
		
		List<Menu> list = service.getList();
		model.addAttribute("list", list);
		
		return "menu/list";
	}
	
	
	@RequestMapping("detail")
	public String detail(Model model) {
		
		
		return "menu/detail";
	}
	
}
