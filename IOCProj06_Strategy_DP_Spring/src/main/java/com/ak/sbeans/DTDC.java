package com.ak.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier {

	private void DTDC() {
		System.out.println("DTDC :: 0-param constructor");

	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "DTDC courier is ready to deliver " +oid+" order number products";
	}

}
