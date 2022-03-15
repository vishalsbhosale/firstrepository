package com.method.loop;

public class DoWhile1 {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		do {
			
			b=b+a;
			a++;
			
		}while(a<=10);
		System.out.println(b);
	}

}
