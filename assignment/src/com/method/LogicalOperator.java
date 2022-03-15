package com.method;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println("------AND operator-------");
		//true && true =true
		System.out.println("And operator test" +(5<7 && 8>6));
		//true && false =false
		System.out.println("And operator test" +(5<7 && 8<6));
		//false && true =false
		System.out.println("And operator test" +(5>7 && 8>6));
		//false && false=false
		System.out.println("And operator test" +(5>7 && 8<6));
		
		//true || true =true
		System.out.println("---------OR operator------------");
		System.out.println("OR operator test" +(5<7 || 8>6));
		//true || false =true
		System.out.println("OR operator test" +(5<7 || 8<6));
		//false || true =true
		System.out.println("OR operator test" +(5>7 || 8>6));
		//false || false=false
		System.out.println("OR operator test" +(5>7 || 8<6));


	}

}
