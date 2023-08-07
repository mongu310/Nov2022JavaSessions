package MethodCalling;

public class User {
	
	String name;
	int age;
	String city;

	public User(String name, int age, String city) {
		this(city);
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public User(String city) {
		
	}


	public static void main(String[] args) {

		User u1 = new User("Gaurav", 30, "Bangalore");
		
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
		
		
	}

}
