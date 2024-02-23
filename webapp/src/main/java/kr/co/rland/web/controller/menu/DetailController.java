package kr.co.rland.web.controller.menu;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.service.MenuService;
import kr.co.rland.web.service.MenuServiceImp;

//@WebServlet("/menu/detail")
public class DetailController extends HttpServlet {
	private MenuService service;
	
	public DetailController() {
		service = new MenuServiceImp(); 
//		service.setRepository(new JDBCMenuRepository());

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=0; 
		
		String tmp = req.getParameter("id");
		
		if(tmp!=null)
			id = Integer.parseInt(tmp);
		Menu menu = service.getMenu(id);
		
		req.setAttribute("menu", menu);
		req.getRequestDispatcher("/WEB-INF/view/menu/detail.jsp").forward(req, resp);
	}

}
