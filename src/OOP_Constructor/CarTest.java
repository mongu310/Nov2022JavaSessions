package OOP_Constructor;

public class CarTest {

	public static void main(String[] args) {
		
		
		//added the car date:
		//POST - Create
		Car c1 = new Car("Audi", 50);
		
		Car c2 = new Car("BMW", "White");
		
		Car c3 = new Car("Honda", 20, false);
		
		Car c4 = new Car("Tesla", "Black", 90, true);
		
		
		
		//fetching the data for the car:
		//GET - 
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.isAutomatic);
		
		System.out.println(c4.name + " " + c4.color + " " + c4.price + " " + c4.isAutomatic);

		
		
		
	}

}
