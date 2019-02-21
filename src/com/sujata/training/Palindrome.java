package com.sujata.training;

import com.sujata.demo.Reverse;

public class Palindrome {

	private int number;
	private boolean palindome;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isPalindome() {
		Reverse rOb=new Reverse();
		rOb.setNumber(number);
		if(number== rOb.getReverse())
			palindome=true;
		return palindome;
	}
	
}
