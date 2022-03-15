package com.method;

public class IfElseIfcondition {

	public static void main(String[] args) {
		IfElseIfcondition obj=new IfElseIfcondition();
		obj.m1(10);

	}
	public void m1(int a) {
		
		if(a<=10) {
			System.out.println("I am equal to or less than 10");
		}
		else if(a>10 && a<20) {
			System.out.println("I am greater than 10 but less than 20");
		}
		else {
			System.out.println("I am greater than 20");
		}
	}

}
