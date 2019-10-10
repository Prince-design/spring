package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("Angus Young")
public class Instrumentalist implements Performer {
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	@Value("Tum ho")
	private String song;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing song" + song);
		instrument.play();
	}

}
