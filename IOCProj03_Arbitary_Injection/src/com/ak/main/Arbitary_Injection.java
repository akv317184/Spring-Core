package com.ak.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ak.config.AppConfig;
import com.ak.sbeans.WishMessageGenerator;

public class Arbitary_Injection {

	public static void main(String[] args) {
		// Create the IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// Get Target spring bean class obj form the container
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		// invoke b.method
		String resutlMsg = generator.showWishMessage("Raja");
		System.out.println(resutlMsg);

		// close the container
		ctx.close();
	}
}