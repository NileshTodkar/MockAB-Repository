package Com.BasicProgrammingknowlge;

public class Methodoverloading {
	
	public void addition(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
		
	}
public void addition(int a,int b, int c ,int d) {
	
	int e=a+b+c+d;
	System.out.println(e);
}
public void addition(String Name) {
	
	Name=Name;
	System.out.println(Name);
		
}
public static void main(String [] args) {
	
Methodoverloading v= new Methodoverloading();
		v.addition(10,30);
		v.addition("velocity family");
		v.addition(100,200,300,400);
	}
}
