package kr.co.rland.web.controller.menu;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.service.MenuService;
import kr.co.rland.web.service.MenuServiceImp;

@WebServlet("/menu/list")
public class ListController extends HttpServlet{
	private MenuService service;
	
	public ListController() {
		service = new MenuServiceImp();
//		service.setRepository(new JDBCMenuRepository());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	
	List<Menu> list = service.getList();

		req.setAttribute("list", list);
		req.getRequestDispatcher("/WEB-INF/view/menu/list.jsp").forward(req, res);
	}
	
}
