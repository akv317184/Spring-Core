// Flipkart.java (Target class)
package com.ak.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	// HAS-A property
	private Courier courier;
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier");
		this.courier = courier;
	}
	
	// b.method
	public String shopping(String items[], double price[]) {
		
		//calculate bill amount
		double billAmount =0.0;
		for(double p:price) {
			billAmount=billAmount+p;
		}
		
		// generate the order id (random number as the order)
		int oid = new Random().nextInt(10000);
		// deliver the products using courier
		String msg = courier.deliver(oid);
		
	return Arrays.toString(items)+ " items with bill Amount :: "+billAmount+"----- oid :: "+msg;
	}
}
