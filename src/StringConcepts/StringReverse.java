package StringConcepts;

public class StringReverse {
	
	//WAF:
	//reverseString()
	//input param: String name
	//retuen: reverse pf Str
	
	public static String reverseString(String name) {
		
		//String name = "Selenium"; //muineleS
		
		//null check
		if(name == null) {
			System.out.println("null is not allowed.. please pass the right value");
			return null;
		}
		
		
		int len = name.length();
		
		//length check, if len = 1
		if(len == 1) {
			return name;
		}
		
		
		
		String rev = "";
		
		for(int i = len-1; i>=0; i--) {
			
			rev = rev + name.charAt(i);
		}
		
		return rev;
		
	}

	public static void main(String[] args) {

		String r1 = reverseString("Selenium");
		System.out.println(r1);
		
		r1 = reverseString("Selenium Automation");
		System.out.println(r1);
		
		r1 = reverseString("10011");
		System.out.println(r1);
		
		r1 = reverseString("N");
		System.out.println(r1);
		
		r1 = reverseString(null);
		System.out.println(r1);
		
		r1 = reverseString("TT");
		System.out.println(r1);
		
		
		//int reverse
		//123 --> 321 assignment
		
		
		
		
	}

}
