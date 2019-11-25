package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SumService {
	
	public String add(int a, int b) {
		return a+b+"";
	}

}
