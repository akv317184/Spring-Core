package com.ak.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	private LocalDateTime ldt;  // HAS-A properties
	
	// Setter Injection
	@Autowired
	private void set(LocalDateTime ldt) {
		this.ldt =ldt;
	}
	
	
	// b.method having b.logic
	public String showWishMessage(String  user) {
		// get current hour of the day
		int hour = ldt.getHour();
		// generate the wish message
		if(hour<12) return "Good Morning : " +user;
		else if(hour<16) return "Good Afternoon : "+user;
		else if(hour<20 ) return "Good Evening : "+user;
		else return "Good Night : "+user;
	}
	}
	
