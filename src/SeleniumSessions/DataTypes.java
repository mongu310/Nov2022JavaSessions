package SeleniumSessions;

public class DataTypes {

	public static void main(String[] args) {
	
		System.out.println("hello world"); 
			
			
			for(char c='a'; c<='z'; c++) {
				System.out.println(c);
			}
			
			for(char c='a'; c<='z'; c++) {
				System.out.println((int)c + ":" + c);
			}
			
			System.out.println("----------");
			for(double d = 1.1; d<=10.0; d++) {
				System.out.println(d);
			}
			
			for(String s = "artem"; s.equals("artem"); ) {
				System.out.println("hi " + s);
				break;
			}
		}

	}
