package com.zensar.spring.instruments;

import org.springframework.stereotype.Component;

@Component
public class Cello implements Instrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cing Cing Cing");
	}

}
