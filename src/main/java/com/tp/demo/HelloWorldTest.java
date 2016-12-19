package com.tp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tp.demo.injection.ConstructorInjection;
import com.tp.demo.injection.SetterInjection;
import com.tp.demo.service.HelloWorldService;

@SpringBootApplication
public class HelloWorldTest {
	public static void main(String[] args){
		ApplicationContext ctx = SpringApplication.run(HelloWorldTest.class, args);
		
		HelloWorldService hwService = (HelloWorldService) ctx.getBean("defaultHelloWorldService");
		hwService.sayHello();
		
		ConstructorInjection conInjection = (ConstructorInjection) ctx.getBean("constructorInjection");
		conInjection.sayHello();
		
		SetterInjection setterInjection = (SetterInjection) ctx.getBean("setterInjection");
		setterInjection.sayHello();
		
	}

}
