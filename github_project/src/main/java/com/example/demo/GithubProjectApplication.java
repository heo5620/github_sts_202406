package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages = "boardmapper")
@ComponentScan(basePackages = "db_jasypt")
@MapperScan(basePackages = "boardmapper")
public class GithubProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubProjectApplication.class, args);
		System.out.println("github 연동");
		System.out.println("sub1 브랜치 사용 조원이 추가한 라인");
	}

}
