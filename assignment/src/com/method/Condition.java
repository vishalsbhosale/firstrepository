package com.method;

public class Condition {

	public static void main(String[] args) {
		int a=18;
		int b=25;
		
		if(a>12 && b>18) {
			//true && true =true
			System.out.println("execute the block1" );
			
		}
	
	
		if(a>12 || b>18) {
			//true || true =true
			
			System.out.println("execute the block2" );
			}
		if(a>20 && b>18) {
			//false && true=false
			System.out.println("execute the block3" );
		}
		if(a>20 || b>18) {
			//false || true=true
			System.out.println("execute the block4" );
		}
		if(a%2==0) {
			System.out.println("Number is even" );
		}
		if(b%2!=0) {
			System.out.println("Number is odd " );
		}

	}
}