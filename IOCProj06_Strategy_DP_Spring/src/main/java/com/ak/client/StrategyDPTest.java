package com.ak.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ak.config.AppConfig;
import com.ak.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		// create the IOC container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	
		// get target spring bean class obj ref
		Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
		// invoke the b.method
		String resutlMsg = fpkt.shopping(new String[] { "shirt","trouser"},
										 new double[] {40000.0,70000.0});
		System.out.println(resutlMsg);
		
		// close the container
		ctx.close();
	}
}
