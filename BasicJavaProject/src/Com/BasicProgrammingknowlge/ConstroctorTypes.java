package Com.BasicProgrammingknowlge;

public class ConstroctorTypes {
	
	String Name;
	int RollNo;
	
	ConstroctorTypes(int RollNo,String Name ,int b ,int c) {// zero argument constructor
		
		System.out.println(RollNo);
		System.out.println(Name);
		System.out.println(b);
		System.out.println(c);
		
		
	}
	ConstroctorTypes(int a,float b){
		
		System.out.println(a);
		System.out.println(b);
		
		}
	
	public void methodone() {
		System.out.println("my name is Nilesh");
	}
	public static void main(String args []) {
		
		ConstroctorTypes obj1= new ConstroctorTypes(32,"Nilesh",20,30);
		ConstroctorTypes obj2= new ConstroctorTypes(100,20.5f);
	
		obj2.methodone();
	}

}
