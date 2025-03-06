package com.ak.factory;

import java.nio.channels.IllegalChannelGroupException;

import com.ak.comps.Bike;
import com.ak.comps.BulletBike;
import com.ak.comps.ElectricBike;
import com.ak.comps.SportsBike;
import com.ak.comps.StandardBike;

public class BikeFactory {

	// static factory method having pattern logic
	public static Bike orderBike(String type) {
		Bike bike= null;
		if(type.equalsIgnoreCase("standard"))
			bike = new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike = new SportsBike();
		else if(type.equalsIgnoreCase("electric"))
			bike = new ElectricBike();
		else if(type.equalsIgnoreCase("bullet"))
			bike = new BulletBike();
		else
			throw new IllegalArgumentException("Invalid Bike Type");
	    return bike;
	}

}
	
