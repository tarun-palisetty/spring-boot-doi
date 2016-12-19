package com.tp.demo.service;

import org.springframework.stereotype.Component;

@Component
public class DefaultHelloWorldService implements HelloWorldService{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World !!!!");
	}

}
