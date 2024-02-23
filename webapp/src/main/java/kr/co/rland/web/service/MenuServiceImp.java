package kr.co.rland.web.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.web.context.MybatisContext;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Service
public class MenuServiceImp implements MenuService {
	
//	@Autowired
//	private SqlSessionFactory factory;
	private MenuRepository repository;

	public MenuServiceImp() {
		
		SqlSessionFactory factory = MybatisContext.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		repository = session.getMapper(MenuRepository.class);
		 
		
	}

	public List<Menu> getList() {
		List<Menu> list = repository.findAll();
		
		return list;
	}

	public Menu getMenu(int id) {
	
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}


}
