package ExceptionHandling;

public class Student {
	
	public static int getMarks(String name) {
		System.out.println("getting marks for :" + name);
		
		if(name.equals("Rashmi")) {
			try {
			int i = 9 / 3;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is comming....");
				return 85;
			}
			finally {
				System.out.println("print mark sheet");
				return 70;
			}
		}
		
		else if(name.equals("Tom")) {
			return 95;
		}
		
		else if(name.equals("Ravi")) {
			return 70;
		}
		
		else {
			System.out.println("student not found...");
			return -1;
		}
		
	}
	

	public static void main(String[] args) {
		
		int m1 = getMarks("Rashmi");
		System.out.println(m1);
		System.out.println("bye");
		
		

	}

}
