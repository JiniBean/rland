package kr.co.rland.web.context;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisContext {

	private static SqlSessionFactory sqlSessionFactory;

	static {
		System.out.println("마이바티스 초기화공간");
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//			MybatisContext.setSqlSessionFactory(sqlSessionFactory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		MybatisContext.sqlSessionFactory = sqlSessionFactory;
	}
	
	
	
	
}
