package com.method;

public class Constructopractice { 
	
	public void m() {
		
		System.out.println("I am paramaterized costructor");
		
	}
	void m1() {
		this.m();
		//Constructopractice obj= new   Constructopractice();
	}
	public static void main(String[] args) {
		Constructopractice obj= new   Constructopractice();
		obj.m1();
		

	}
}