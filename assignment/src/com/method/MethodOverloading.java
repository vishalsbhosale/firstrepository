package com.method;

public class MethodOverloading {

	public static void main(String[] args) {
		 MethodOverloading obj=new  MethodOverloading();
		
		 obj.add(10, 20);
		 obj.add(10, 20,30);
		 obj.add(10,1.25f); 
		 obj.add(1.25f, 10);
	}
public void add(int a,int b) {
	System.out.println("Addition"+ (a+b) );
}
public void add(int a,int b,int c) {
	System.out.println("Addition"+ (a+b+c) );//Number of parameter
}
public void add(int a,double b) {
	System.out.println("Addition"+ (a+b) );	//Data type of parameter
}
public void add(double b,int a) {
	System.out.println("Addition"+ (a+b) );//Order of parameter
}
}
