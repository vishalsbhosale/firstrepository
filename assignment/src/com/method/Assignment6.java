package com.method;

public class Assignment6 {
     public int m1(int a) {
    	 System.out.println("This is value of a=" +a);
    	 return a;
    	 
     }
     protected int m2 (int b) {
    	 System.out.println("This is value of b=" +b);
    	 return b;
    	 
     }
	public static void main(String[] args) {
        Assignment6 obj = new Assignment6();
           obj.m1(6);
           obj.m2(7);
             
          
	}
	

}
