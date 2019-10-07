package com.zensar.spring.performers;

public class Juggler implements Performer {
	private int beanBags;
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No arg constructor of juggler");
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Parameterized constructor of jugglers");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
System.out.println("Juggler juggling bean bags" +beanBags);
	}

}
