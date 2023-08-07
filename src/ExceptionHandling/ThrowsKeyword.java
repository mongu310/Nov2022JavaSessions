package ExceptionHandling;

public class ThrowsKeyword {
	
	
	public void m1() {
		System.out.println("m1 mwthod");
		m2();
	}
	
	public void m2()  {
		System.out.println("m2 mwthod");
		
		try {
		m3();
		}
		catch(ArithmeticException e) {
			System.out.println("AE is comming...");
			e.printStackTrace();
		}
	}
	
	public void m3() throws ArithmeticException {
		System.out.println("m3 mwthod");
		int a = 10;
		int b = 0;
		int c = a/b;
	}
	

	public static void main(String[] args)  {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");
		
		
		
	}

}
