package DataConversion;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		
		System.out.println(x+20);//10020
		
		
		//String to int:
		int i =  Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "100USD";
		System.out.println(y+20);
		
		String curr[] = y.split("USD");
		System.out.println(curr[0]);
		
		
		int j = Integer.parseInt(curr[0]);//NumberFormatException
		System.out.println(j+20);
		
		//String to double:
		String z = "12.33";
		System.out.println(z+20);
		
		double d = Double.parseDouble(z);//12.33
		System.out.println(d+20);
		
		//String to boolean:
		String headless = "true";
		
		if(Boolean.parseBoolean(headless)); {
			
			System.out.println("run in headless");
		}
		
		//int to String:
		int k = 100;
		String k1 = String.valueOf(k);//"100"
		System.out.println(k1+20);
		
		boolean flag = true;
		String f1 = String.valueOf(flag); //"true"
		
		//
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		
		
		
		
		
	}

}
