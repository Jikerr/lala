package com.lala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan // 扫描使用注解方式的servlet
public class LalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LalaApplication.class, args);
	}
}
