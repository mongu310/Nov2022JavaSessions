package ExceptionHandling;

public class Employee {
	
	String name;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			Employee obj = new Employee();
			obj = null;
			obj.name = "Naveen";//NPE
			int i = 9/0;//AE
			System.out.println("hello");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("hello");
		
		System.out.println("Bye");
		
		Thread.sleep(2000);


		
		
	}

}
