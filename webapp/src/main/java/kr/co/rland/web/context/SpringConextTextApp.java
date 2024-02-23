package kr.co.rland.web.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.Menu;

public class SpringConextTextApp {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
				new AnnotationConfigApplicationContext("kr.co.rland.web.entity");//빨리 찾기위해서
		
		{
			Menu menu = (Menu) context.getBean("menu"); //묵시적으로 소문자로 
			System.out.println(menu);
			
		}
		
		{
			Menu menu = context.getBean(Menu.class);
			System.out.println(menu);
		}
	}

}
