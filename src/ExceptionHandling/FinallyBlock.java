package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("hi");
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is comming...");
			e.printStackTrace();
		}
		finally {
			System.out.println("fianlly block...");
		}
		
		System.out.println("bye");
		
		
		//connect with DB --- oracle --- PASS
		//un, pwd, server ip: port
		//hit the SQL --- PASS
		//try {
		//get the result from DB --- FAIL -- exception
		//  }
		//catch(){}
		//finally {
		//disconnect with DB
		//  }
		
		System.out.println("continue shopping");
		//logout
		
		
		
	}

}
