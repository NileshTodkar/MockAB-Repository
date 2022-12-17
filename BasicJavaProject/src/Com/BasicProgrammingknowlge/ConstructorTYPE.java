package Com.BasicProgrammingknowlge;

public class ConstructorTYPE {
   int c;
   String Name;
   int d;
	ConstructorTYPE(int a,int b){
		 c=a*b;
}
	ConstructorTYPE(int d,String Name){
		this.d=d;
		this.Name=Name;
	}
	public static void main(String args []) {
		ConstructorTYPE j= new ConstructorTYPE(10,20);
		ConstructorTYPE k= new ConstructorTYPE(20,"Nilesh");
		System.out.println(j.c);
		System.out.println(k.d);
		System.out.println(k.Name);
	}
}
