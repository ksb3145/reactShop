package com.myshop.react1;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

//@MapperScan(basePackages = "com.myshop.react1.dao")
@SpringBootApplication
public class React1Application {

	public static void main(String[] args) {
		SpringApplication.run(React1Application.class, args);
	}

}
