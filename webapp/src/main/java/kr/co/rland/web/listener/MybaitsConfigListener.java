package kr.co.rland.web.listener;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
//import kr.co.rland.web.context.MybatisContext;

@WebListener
public class MybaitsConfigListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("톰캣 시작");
		try {
			Class.forName("kr.co.rland.web.context.MybatisContext");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("톰캣 꺼짐");
	}

}
