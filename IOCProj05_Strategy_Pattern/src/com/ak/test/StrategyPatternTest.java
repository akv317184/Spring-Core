// StrategyPatternTest.java
package com.ak.test;

import com.ak.comp.Flipkart;
import com.ak.factory.FlipkartFactory;

public class StrategyPatternTest {

	public static void main(String[] args) {
		// use Factory Pattern to target class object
		Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
		
		// invoke the b.method
		String resultMsg = fpkt.shopping(new String[] {"shirt","trouser"},
				         					new double[] {5000.0,6000.0});
		
		System.out.println(resultMsg);
	}
}
