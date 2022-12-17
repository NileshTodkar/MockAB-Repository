package com.Hierarchical_Inheritance;

public class SubClass3 extends SuperClass {
	int c=30;
	int d=50;
	
	public void Method4() {
		int e=a%b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	
		
		
		}

public static void main(String args []) {
	SubClass3 v= new SubClass3();
	v.Method4();
	v.Method1();
	
}
}
