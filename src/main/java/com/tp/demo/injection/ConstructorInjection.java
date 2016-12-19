package com.tp.demo.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tp.demo.service.HelloWorldService;

@Component
public class ConstructorInjection {
	
	private HelloWorldService helloWorldService;
	
	@Autowired
	public ConstructorInjection(HelloWorldService helloWorldService){
		this.helloWorldService = helloWorldService;
	}
	

	public void sayHello(){
		helloWorldService.sayHello();
	}
	
}
