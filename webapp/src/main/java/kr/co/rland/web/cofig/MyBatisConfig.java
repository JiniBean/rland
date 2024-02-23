//package kr.co.rland.web.cofig;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//@Configuration
//public class MyBatisConfig {
//	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//		factoryBean.setDataSource(dataSource);
//		factoryBean.setMapperLocations(new ClassPathResource("mappers/MenuRepositoryMapper.xml"));
//		
//		return factoryBean.getObject();
//	}
//}

