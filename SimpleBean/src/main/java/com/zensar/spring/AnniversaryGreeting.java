package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Happy Anniversary";
	}

	public AnniversaryGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Anniversary Greeting is Created");
	}
}
