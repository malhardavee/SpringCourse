package com.telusko.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.telusko.springdemo")
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		Alien obj = context.getBean(Alien.class);
		obj.code();
		obj.setAge(15);
		System.out.println(obj.getAge());
	}
}
