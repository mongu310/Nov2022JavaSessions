package SeleniumSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {

		int p = 1;
		
		do {
			System.out.println(p);
			p++;//
		} while (p<=10);
		
		System.out.println("-----------------------");
		
		int e = 1;
		
		do {
			e++;//
			System.out.println(e);
			
		} while (e<=10);
		
		System.out.println("-----------------------");
		
		int a = 1;
		
		do {
			a++;//
			System.out.println(a);
			a++;//
			
		} while (a<=10);
		
		System.out.println("-----------------------");
		
		int r = 1;
		
		do {
			
			System.out.println(r);
			r++;
			
		} while (r>=10);
		
		System.out.println("-----------------------");
		
		int d = 1;
		
		do {
			
			System.out.println(d);
				if(d==10) {
					break;
				}
			d++;
			
		} while (d<=50);
		
		System.out.println("-----------------------");
		
		int s = 1;
		
		do {
			
			System.out.println(s);
				if(s % 5 == 0) {
					System.out.println("hi");
				}
			s++;
			
		} while (s<=50);
		
		
		//use cases:
		//1. launch a page: element: 0sec, 5sec, 10sec, 20sec ....
		
//		do {
//			element is present : yes
//			click on the element
//		}
//		while(condition);
		
		//2. 


		
		
		
		
	}

}
