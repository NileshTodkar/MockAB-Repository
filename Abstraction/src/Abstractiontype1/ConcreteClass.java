package Abstractiontype1;

public class ConcreteClass extends AbstractClass  {
	
public void bike() {
	System.out.println("My bike is MT-50");
		
	}
	

	public static void main(String args []) {
		 ConcreteClass v=new  ConcreteClass();
		 v.bike();
		 v.car();
		 
}
}