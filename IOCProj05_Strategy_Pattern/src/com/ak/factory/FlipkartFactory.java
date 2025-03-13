//FlipkartFactory.java (Factory Pattern class)
package com.ak.factory;

import com.ak.comp.BlueDart;
import com.ak.comp.Courier;
import com.ak.comp.DTDC;
import com.ak.comp.Flipkart;

public class FlipkartFactory {
	
	// static factory method having factory pattern logic
	public static Flipkart	getInstance(String courierType) {
		// create Dependent class obj
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier =new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier = new BlueDart();
		else 
				throw new IllegalArgumentException(" Invalid courier type");
	
		// create target class obj
		Flipkart fpkt = new Flipkart();
		// assign dependent class object to target class obj

		fpkt.setCourier(courier);
		return fpkt;
	}

}
