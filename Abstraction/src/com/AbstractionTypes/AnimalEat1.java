package com.AbstractionTypes;

 public interface AnimalEat1 {
	void eat(); 
}	

public  interface AnimalTravel1 {
	void travel();
}
  class Animal implements AnimalEat1,AnimalTravel1{
	public void eat() {
		 System.out.println("Animals are Eating");
		 } 
	public void travel() {
		 System.out.println("Animals are Travelling");
		 } 
	 }
  class MasterClass{
	  public static void main(String args[]) {
		  Animal v= new Animal();
		  v.eat();
		  v.travel();
		   }
	  }
