package Com.BasicProgrammingknowlge;

import java.util.Scanner;

public class RelienceMart {
	static float a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,Qty,Price,Total,a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	
	public void martDetails() {
		System.out.println("_____________________\n");
		System.out.println("********Welcome to ********");
		System.out.println("\t\t  GST NO : 27AACCA8432HT2Q");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t\t        Relience-MART HADAPSAR");
		System.out.println("\t\t      Phone : 020-3965210");
		System.out.println("---------------------------------------------------------------");
	}
		public void productsDetails() {
			
			a=60;
			b=120;
			c=160;
			d=20;
			e=40;
			f=140;
			g=90;
			h=50;
			i=150;
			j=20;
			System.out.println("***** Products Available in Marts is :   \n");
			System.out.println("Sugar="+ a + "Rs/Kg");
			System.out.println("Peanut="+ b + "Rs/Kg");
			System.out.println("Oil="+ c +"Rs/Lit" ); 
			System.out.println("Salt=" +   d +"Rs/Kg");
			System.out.println("Soap" + e +"Rs/Piece");
			System.out.println("Mungdal"+f +"Rs/Kg");
			System.out.println("Colgate" + g +"Rs/Kg");
			System.out.println("Agarbatti"+ h +"Rs/Kg");
			System.out.println("Coldrink"+ i +"Rs/Piece" );
			System.out.println("Maggi"+ j +"Rs/Piece" );
			System.out.println("---------------------------------------------------------------");
		}
		
	public static void main(String args[])	{
		RelienceMart t=new RelienceMart();
		Scanner r= new Scanner(System.in);
		t.productsDetails();
		System.out.println("Enter Sugar Qty(KG)=");
		float a1=r.nextFloat();
		System.out.println("Enter peanut Qty(KG)=");
		float b1=r.nextFloat();
		System.out.println("Enter oil Qty(Litter)=");
		float c1=r.nextFloat();
		System.out.println("Enter Salt Qty(KG)=");
		float d1=r.nextFloat();
		System.out.println("Enter Soap Qty(Piece)=");
		int e1=r.nextInt();
		System.out.println("Enter Mugdal Qty(KG)=");
		float f1=r.nextFloat();
		System.out.println("Enter Colgate Qty(Piece)=");
		int g1=r.nextInt();
		System.out.println("Enter Agarbatti Qty(Piece)=");
		int h1=r.nextInt();
		System.out.println("Enter Colddrinks Qty(Piece)=");
		int i1=r.nextInt();
		System.out.println("Enter Maggi Qty(Piece)=");
		int j1=r.nextInt();
		
		System.out.println("\nYou Purchased Products List:");
		System.out.println("______________________\n");
		System.out.println("You Ordered:"+"   "+ " Product"+"        " + "    Qty"+"      "+"Price_per_unit"+"     Total_Amount");
		System.out.println("______________________");
		
		if(a1>0 && a1<50) {
			
			p1=a*a1;
			System.out.println("\t\t"+ "Sugar     "+"        " + a1+"         "+ a + "Rs/Kg"+"             "+p1);
			}
		if(b1>0 && b1<50) {
			p2=b*b1;
			System.out.println("\t\t"+ "Peanut    "+"        " + b1+"         "+ b+ "Rs/Kg" +"             "+p2);
			}
		if(c1>0 && c1<50) {
			p3=c*c1;
			System.out.println("\t\t"+ "oil       "+"        " + c1+"         "+ c+ "Rs/Lit" +"             "+p3);
			}
		if(d1>0 && d1<50) {
			p4=d*d1;
			System.out.println("\t\t"+ "Salt      "+"        " + d1+"         "+ d+"Rs/Kg" +"             "+p4);
			}
		if(e1>0 && e1<50) {
			p5=e*e1;
			System.out.println("\t\t"+ "Soap      "+"         " + e1 +"         "+ e+"Rs/Piece" +"             "+p5);
			}
		if(f1>0 && f1<50) {
			p6=f*f1;
			System.out.println("\t\t"+ "Mugdal    "+"        " + f1+"         "+ f+"Rs/Kg" +"             "+p6);
			}
		if(g1>0 && g1<50) {
			p7=g*g1;
			System.out.println("\t\t"+ "Colgate   "+"         " + g1+"         "+ g+"Rs/Piece" +"             "+p7);
			}
		if(h1>0 && h1<50) {
			p8=h*h1;
			System.out.println("\t\t"+ "Agarbatti "+"         " + h1+"         "+ h+"Rs/Piece" +"             "+p8);
			}
		if(i1>0 && i1<50) {
			p9=i*i1;
			System.out.println("\t\t"+ "Colddrinks"+"         " + i1+"         "+ i+"Rs/Piece" +"             "+p9);
			}
		if(j1>0 && j1<50) {
			p10=j*j1;
			System.out.println("\t\t"+ "Colddrinks"+"         " + j1+"         "+ j+"Rs/Piece" +"             "+p10);
			}
		System.out.println("\t\t"+ "           "+"                             " +"--------------------------   ");
		
		Total=p1+p2+p3+p4+p5+p6+p7+p8+p9+p10;
		System.out.println("\t\t"+ "           "+"                             " +"             "+Total);
		System.out.println("\n\n\t\t  *Thank you for Shopping**\n");
		
		
}
}
