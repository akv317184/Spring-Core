package com.ak.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart :: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "BlueDart courier is ready to deliver"+oid+"order number products ";
		
	}

}
