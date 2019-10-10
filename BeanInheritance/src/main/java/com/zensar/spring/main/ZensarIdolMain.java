package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.instruments.Instrument;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
		Instrument p = ctx.getBean("Cello", Instrument.class);
		p.play();
		Performer p1 = ctx.getBean("Angus Young", Performer.class);
		p1.perform();
		Performer p2 = ctx.getBean("kk", Performer.class);
		p2.perform();
		Performer p3 = ctx.getBean("Lucky Ali", Performer.class);
		p3.perform();
	}

}
