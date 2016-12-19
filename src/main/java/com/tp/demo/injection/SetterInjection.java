package com.tp.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tp.demo.service.HelloWorldService;

@Component
public class SetterInjection {

	@Autowired
	private HelloWorldService helloWorldService;

	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void sayHello(){
		helloWorldService.sayHello();
	}
}
