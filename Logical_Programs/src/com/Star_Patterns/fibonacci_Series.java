package com.Star_Patterns;

public class fibonacci_Series {
	public static void main(String args []) {
		 int a=1,b=2,c;
		for(int i=1;i<=10;++i) {
	System.out.print(a+", ");
	      c=a+b;
	      a=b;
	      b=c;
	}
	}

}
