package com.nilesh;

public class MyNonStaticProgram {
	public void nonStaticMethod() {
		System.out.println("This is JAVA Programming");
			
	}
	public void nilesh() {
		System.out.println(100+100);
	
	}
public static void main(String [] args) {
	MyNonStaticProgram r= new MyNonStaticProgram();//it is an instance of class
	//Syntax for creating an Object->
	// Classname object reference-variable= keyword classname/constructor ();
	
r.nonStaticMethod();
r.nilesh();

}
}
