package SeleniumSessions;

public class ForLoopsConcept {

	public static void main(String[] args) {

		// 1 - 10 
		for(int i=1; i<=10; i++) {
			System.out.println(i);//1 2 3 4 . . . 10
		}
		
		//
//		for(;;) {
//			System.out.println("Bye");//interview question
//		}
		//
//		for(;flase;) {
//			System.out.println("Bye");
//		}
		
		System.out.println("-----------------");
		
		//5 to 50
		for(int k = 5; k <= 50; k++) {
			System.out.println(k);
				if(k % 5 == 0) {
					System.out.println("hiiiii");
					break;
				}
		}
		
		System.out.println("-----------------");
		
		//97 to 122

		//a to z:
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println((int)c + ":" + c);
		}
		
		System.out.println("-----------------");
		
		for(byte b = 1; b <= 5; b++) {
			System.out.println(b);
		}
		//
		System.out.println("-----------------");

		for(double d = 1.1; d <= 10.0; d++) {
			System.out.println(d);//1.1 2.1 3.1 ...... 9.1
		}
		
		System.out.println("-----------------");
		
		for(String s = "artem"; s.equals("artem"); ) {
			System.out.println("hi " + s);
			break;
		}
		
		//use cases for loop:
		//1. Number of iterations are fixed:
		//2. Month drop: Jan to Dec
		//3. Ecomm: category iterations
		//4. Country:
				
		
		
		
		
		
		
		
	}

}
