package org.acme.quickstart;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RandomInt {
	
	static int i=0;
	
	public int getRandomInt() {
		Random r = new Random(i++);
		return r.nextInt(100);
	}

}
