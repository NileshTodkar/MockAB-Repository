package Com.BasicProgrammingknowlge;

public class Dmart {
	public  void Products()
	{
		System.out.println("_____________________\n");
		System.out.println("********Welcome to DEMART********");
		System.out.println("\t\t  GST NO : 27AACCA8432HT2Q");
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t\t        D-MART HADAPSAR");
		System.out.println("\t\t      Phone : 020-3965210");
		System.out.println("---------------------------------------------------------------");
		
	}	

	public void prod_details()
{
		System.out.println("**PRODUCTS AVAILABLE HERE**\n");
		
		System.out.println("Sugar     - 60rs/kg");
		System.out.println("Peanut    - 120rs/kg");
		System.out.println("Oil       - 160rs/kg"); 
		System.out.println("Salt      - 20rs/kg");
		System.out.println("Soap      - 40rs/item");
		System.out.println("Mungdal   - 120rs/kg");
		System.out.println("Colgate   - 130rs/item");
		System.out.println("Agarbatti - 50/items");
		System.out.println("Coldrink  - 200/litre");
		System.out.println("Jaggery   - 80rs/kg");
		System.out.println("---------------------------------------------------------------");
		

	}


	String Product;
	int Qty,Price,a,b,c,d,e,f,g,h,i,j,Total;

	public void sugar(String s,int  q,int p)
	{
		
		
		Product= s ;
		Qty= q;
		Price= p;
		c = Price*Qty;
				System.out.println("\nYou Purchased Products List:");
				System.out.println("______________________\n");
				System.out.println("You Ordered:"+"   "+ " Product"+" " + "    Qty"+"   "+"Price_per_unit"+"   Total_Amount");
				System.out.println("______________________");
				System.out.println("\t\t"+ Product+"        " + Qty+"         "+ Price +"             "+c);

	}


	void Product2()
	{
		Product = "Peanut" ;
		Qty= 2;
		Price= 120;
		b = Price*Qty;
		System.out.println("\t \t"+ Product+"       "+Qty+"         " + Price+"            "+b );
		
	}
	void Product3()
	{
		Product = "Oil" ;
		Qty= 2;
		Price= 160;
		a = Price*Qty;
		System.out.println("\t \t"+ Product+"          "    + Qty+"         "+ Price+"            "+a);
		
	}

	void Product4()
	{
		Product = "Salt" ;
		Qty= 4;
		Price= 20;
		d = Price*Qty;
		System.out.println("\t \t"+ Product+"         " + Qty+"         "+ Price+"             "+d);
		
	}

	void Product5()
	{
		Product = "Soap" ;
		Qty= 3;
		Price= 40;
		e = Price*Qty;
		System.out.println("\t \t"+ Product+"         "    + Qty+"         "+ Price+"             "+e);
		
	}

	void Product6()
	{
		Product = "Mungdaal" ;
		Qty= 3;
		Price= 120;
		f = Price*Qty;
		System.out.println("\t \t"+ Product+"     "    + Qty+"         "+ Price+"            "+f);
		
	}
	void Product7()
	{
		Product = "Colgate" ;
		Qty= 2;
		Price= 130;
		g = Price*Qty;
		System.out.println("\t \t"+ Product+"      "    + Qty+"         "+ Price+"            "+g);
		
	}

	void Product8()
	{
		Product = "Agarbatti" ;
		Qty= 2;
		Price= 50;
		h = Price*Qty;
		System.out.println("\t \t"+ Product+"    "    + Qty+"         "+ Price+"             "+h);
		
	}
	void Product9()
	{
		Product = "Coldrink" ;
		Qty= 3;
		Price= 200;
		i = Price*Qty;
		System.out.println("\t \t"+ Product+"     "    + Qty+"         "+ Price+"            "+i);
		
	}
	void Product10()
	{
		Product = "Jaggery" ;
		Qty= 2;
		Price= 80;
		j = Price*Qty;
		System.out.println("\t \t"+ Product+"      "    + Qty+"         "+ Price+"             "+j);
		
	}


	void total()
	{
		Total=a+b+c+d+e+f+g+h+i+j;
		System.out.println("______________________");
		System.out.println( "       "+"\t\tTotal:\t\t\t\t      "+ Total);
		System.out.println("______________________");
		System.out.println("\n\t\t  *Thank you for Shopping**\n");
	}

	public static void main(String args[])	
	{
	Dmart p1 = new Dmart(); 
	p1.Products();
		p1.prod_details();
 
		p1.sugar("sugar",3,60);//sugar
		p1.Product2();//peanut
	    p1.Product3();//Oil 
		p1.Product4();//Salt 
		p1.Product5();//Soap  
		p1.Product6();//Mungdaal 
		p1.Product7();//Colgate
		p1.Product8();//Agarbatti
	    p1.Product9();//Coldrink
		p1.Product10();//Jaggery


		p1.total();
		

	}
	}

