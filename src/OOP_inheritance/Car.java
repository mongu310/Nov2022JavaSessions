package OOP_inheritance;

public class Car extends Vehicle{
	
	//final
	//1.constant value
	//2. to prevent method overriding and method hiding 
	//3. to prevent inheritance
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void billing() {
		System.out.println("Car - billing");
	}
	
	public static final void display() {
		System.out.println("Car -- display");
	}
	
	public final void running() {
		System.out.println("Car -- running");
	}
	
	public void payment(String cc, int cvv) {
		System.out.println("Car payment useing : " + cc + " : " + cvv);
	}
	
	public void payment(String upi) {
		System.out.println("Car payment using : " + upi);
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- engine");
	}
	
	

}
