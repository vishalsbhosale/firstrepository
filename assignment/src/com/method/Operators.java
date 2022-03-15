package com.method;

public class Operators {

	public static void main(String[] args) {
		//Arithmatic Operator
		System.out.println("------Arithmatic operator-----");
		Operators obj=new Operators ();
		obj.add(2, 3);
		obj.sub(3, 2);
		obj.mul(2, 3);
		obj.divr(2, 3);
		 Operators.divq(2, 3);
		 //Relational Operator
		 System.out.println("-----------Relational operator----------");
		 obj.r1(5,6);
        obj.r2(5, 6);
        obj.r3(5, 6);
        obj.r4(5, 6);
        //Not Operator
        System.out.println("------Not operator--------");
        obj.r5(true);
        //Unary Operator
        System.out.println("-----------Unary operator--------");
        Operators.increment(10);
        Operators.decrement(8);
        
	}
public void add(int a,int b) {
	System.out.println("Addition" + (a+b));
}
public void sub(int a,int b) {
	System.out.println("Substraction" + (a-b));
}
public void mul(int a,int b) {
	System.out.println("Multiplication" + (a*b));
}
public static void divq(int a,int b) {
	System.out.println("Devision with Quetient" + (a/b));
}
public void divr(int a,int b) {
	System.out.println("Devision with Remainder" + (a%b));
}
//Relational Operator

public void r1(int a,int b) {
	System.out.println("Assignment" + (a==b));
}
public void r2(int a,int b) {
	System.out.println("Not equal to" + (a!=b));
}
public void r3(int a,int b) {
	System.out.println("Greater than" + (a<b));
	System.out.println("Greater than equal to" + (a<=b));
}
public void r4(int a,int b) {
	System.out.println("Less than" + (a>b));
	System.out.println("Less than equql to" + (a>=b));
}
//Not operator
public void r5(boolean a) {
	
	System.out.println("Not equal to" + (!a));
	
		
	
}
//Unary Operator
public static void increment(int a) {
	System.out.println("Add by one & Assign" + (++a));
	System.out.println("Assign & Add by one" + (a++));
	System.out.println(a);
}

	
public static void decrement(int a){
	
	System.out.println("Subtract by one & Assign" + (--a));
	System.out.println("Assign & Subtract by one" + (a--));
	System.out.println(a);
}



}


