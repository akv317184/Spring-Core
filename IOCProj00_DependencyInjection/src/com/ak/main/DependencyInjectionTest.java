//Main class
package com.ak.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ak.config.AppConfig;
import com.ak.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String args [] ) {
		// create the IOC Container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		/*
		// get Target spring bean class obj from the container
		   Object obj = ctx.getBean("wmg"); // here obj(Object class ref variable) isrefering WishMessageGenerator class obj
		   // type casting to WishMessageGenerator class
		   WishMessageGenerator generator = (WishMessageGenerator)obj;
		*/
		
		
		// get Target spring bean class obj form the container
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class); // getBEa(-,-) with generic
		// invoke b.method
		String resultMsg = generator.showWishMessage("Raja");
	    System.out.println(resultMsg);
	    
	    // close the container
	    ctx.close();
	}
}
