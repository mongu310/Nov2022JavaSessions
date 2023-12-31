package SeleniumSessions;

public class Application {
	
	//Method Overloading:
	//within the same class: we have different methods:
	//1. with the same name
	//2. with different number of parameters with different type
	//3. with different sequence of parameter
	//4. return type doesn't matter
	
	//Poly(Many) Morphism(Forms) -- OOP
	//compile time (static)
	
	public void test() {//0 parameter
		System.out.println("test - 0 param");
	}
	
	public void test(int i) {// 1 parameter
		System.out.println("1 param: " + i);
	}
	
	public void test(String i) {// 1 parameter
		System.out.println("");
	}
	
	public void test(int i, int j) {// 2 parameter
		
	}
	
	public void test(int i, String j) {// 2 parameter
		
	}
	
	public void test(String i, int j) {// 2 parameter
		
	}
	
	
	//
	//examples:
	//login:
	public void login() {
		
	}
	
	public void login(String un, String pwd) {
		
	}
	
	public void login(String un, String pwd, String role) {
		
	}
	
	public void login(String un, String pwd, String role, int otp) {
		
	}
	
	
	//
	//search
	public void search() {
		
	}
	
	public void search(String productName) {
		
	}
	
	public void search(String productName, int price) {
		
	}
	
	public void search(String productName, int price, String color) {
		
	}
	
	
	//
	//payment
	public void doPayment(String cc, String cvv) {
		
	}
	
	public void doPayment(String upi) {
		
	}
	
	public void doPayment(String un, String pwd, int otp) {
		
	}
	
	


	public static void main(String[] args) {

		Application obj = new Application(); 
		obj.test();
		obj.test(20);
		obj.test("naveen");
		
		
	}

}
