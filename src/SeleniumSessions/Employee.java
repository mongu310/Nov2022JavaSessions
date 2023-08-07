package SeleniumSessions;

public class Employee {
	
	//class : category of Objects / blueprint or template of Objects
	//Object : is the physical entity
	
	//class variables:
	String name;
	int age;
	String city;
	double salary;
	

	public static void main(String[] args) {
		
		//create the object of the class:
		//using new keyword:
		Employee e1 = new Employee(); 
		
		e1.name = "Tom";
		e1.age = 25;
		e1.city = "LA";
		e1.salary = 12.33;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary);
		
		System.out.println("------------------------");
		
		//
		Employee e2 = new Employee();
		
		 System.out.println(e2.name);//null
		 System.out.println(e2.age);//0
		 System.out.println(e2.salary);//0,0
		 
		System.out.println("------------------------");
		 
		 //
//		Employee e3 = new Employee();
//		 e3 = null;//null reference object
//		 e3.name = "artem";
		
		//object without references - no ref object 
		new Employee().name = "Naveen";
		new Employee().age = 25;
		new Employee().salary = 12.33;
		new Employee().city = "Pune";
		
		System.gc();
		 
				
				
				
		
	}

}
