package com.zensar.spring.instruments;

public class Cello implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cing Cing Cing");
	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Cello is tuned");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Violin is clean");
	}

}
