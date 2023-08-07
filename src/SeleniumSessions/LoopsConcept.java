package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);//1 2 3 4 5 6 7 8 9 10
			i++;
		}
		
		//
		while(true) {
			System.out.println("welcome to taj hetel");
			break;
		}
		
		//
		int p = 0;
		while(p<=100) {
			System.out.println(p);//0 2 4 6 ..... 100
			p=p+2;
		}
		
		System.out.println("---------------");
		//
		int num = 1;
		while(num<=100) {
			System.out.println(num);//12345
				if(num % 5 == 0) {
					System.out.println("hi");//hi
					break;
				}
		num++;
		}
		
		//
		int n = 1;
		while(n<=5) {
			System.out.println(n + " = " + "Anjali");
			n++;
		}
		
		//
		int counter = 100;
		while(counter>=100) {
			System.out.println(counter);//100
			
			if(counter == 200) {
				System.out.println("bye!!");
				break;
			}
			counter++;
		}
		
		System.out.println("---------------------");
		
		//
		int score = 0;
		while(score<=100) {
//				if(score == 25) {
//					System.out.println("score is 25...yay");
//				}
//				
//				if(score == 50) {
//					System.out.println("half century");
//				}
//				
//				if(score == 100) {
//					System.out.println("century");
//				}
			
			switch (score) {
			case 25:
				System.out.println(score);
				System.out.println("score is 25...yay");
				break;
			case 50:
				System.out.println(score);
				System.out.println("half century");
				break;
			case 100:
				System.out.println(score);
				System.out.println("century");
				break;

			default:
				System.out.println(score);
				break;
			}
			
				score++;
		}
		
		//while loop use cases:
		//1. When number of iterations are not fixed
		//2. Infinite loading: Linkedin, Swiggy, Facebook
		//3. Waiting for the element on the page: 5sec, 0sec, 15sec, 20sec
		//4. Waiting for the page to load: 5sec, 10sec, 2sec, 20sec
		//5. Calendar handling
		//6. Pagination in webtable 
		
		
		
		
		
		
		
		

	}

}
