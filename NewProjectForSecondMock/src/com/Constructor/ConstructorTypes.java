package com.Constructor;

public class ConstructorTypes {
	
String City;
static int a=10;

public static void method1() {
	System.out.println("My Name is Nilesh");
	float a=214748364.2147483648f;
	System.out.println(a);
}
public void method2() {
	System.out.println(a);
}
ConstructorTypes(){
	String City="Pune";
	System.out.println(City);
}
ConstructorTypes(int a,float b){
	System.out.println(a);
	System.out.println(b);
}
public static void main (String [] args) {
	method1() ;
	ConstructorTypes a1=new ConstructorTypes();
	ConstructorTypes a2=new ConstructorTypes(1000,56.24f);
	ConstructorTypes a3=new ConstructorTypes(1200,25.36f);
	a1.method2();
	
	
	
}
}
