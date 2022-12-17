package com.AbstractionTypes;
interface Home {
	void eat(); 
	
}
	 interface AnimalTravel1 {
		void travel();
	}
	  class Animal implements Home,AnimalTravel1{
		public void eat() {
			 System.out.println("Animals are Eating");
			 } 
		public void travel() {
			 System.out.println("Animals are Travelling");
			 } 
		 }
	  class MasterClass {
		  public static void main(String args[]) {
			  Animal v= new Animal();
			  v.eat();
			  v.travel();
			   }
		  }
	


