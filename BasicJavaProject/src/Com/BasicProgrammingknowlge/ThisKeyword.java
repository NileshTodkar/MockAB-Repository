package Com.BasicProgrammingknowlge;

public class ThisKeyword {
	static String Name;
	static int Rollno;
	static float Fees;
	ThisKeyword(String Name,int Rollno,float Fees){
		
       this.Name=Name;
	   this. Rollno=Rollno;
	   this.Fees=Fees;
		
		
			}
	public void display(int a) {
		System.out.println(Name);
		System.out.println(Rollno);
		System.out.println(Fees);
		System.out.println(a);
		
	}
public void display(int a,int c) {
	System.out.println(Name);
	System.out.println(Rollno);
	System.out.println(Fees);
	System.out.println(a);
	System.out.println(c);
		
	}
	
	public static void main(String args[]) {
		ThisKeyword r1=new ThisKeyword("Nilesh",45,34.5f);	
		ThisKeyword r2=new ThisKeyword("Laxmi",85,45.6f);
		r1.display(20);
		r2.display(30,40);
		
		
	}
}

