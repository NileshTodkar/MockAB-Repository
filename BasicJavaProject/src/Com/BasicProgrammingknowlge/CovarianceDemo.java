package Com.BasicProgrammingknowlge;
import java.util.Date;
//CovarianceDemo
class CovarianceDemo {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter(10);
	}

	class MyInner {
		int x = 8;

		public void seeOuter(int x) {
			System.out.println("Local x is " + x);
			System.out.println("Inner class's x is " + this.x);
			System.out.println("Outer class's x is " + CovarianceDemo.this.x);
		}
	}

	public static void main(String[] args) {
		CovarianceDemo.MyInner inner = new CovarianceDemo().new MyInner();
		inner.seeOuter(9);
		
}
}