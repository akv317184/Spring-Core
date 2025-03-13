// BlueDart.java (Dependent class)
package com.ak.comp;

public class BlueDart implements Courier {
	
	@Override
	public String deliver(int oid) {
		
		return oid +" Order items are kept for deliery by BlueDart";
	}

}
