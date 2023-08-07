import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "hi this is my java code amd I am so happy";
		
		System.out.println(str.length());
		int len = str.length();
		int li = 0;
		int hi = len-1;
		System.out.println(hi);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));
		System.out.println(str.charAt(2));

		
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf("java"));
		
		String m1 = "welcome admin";
		if(m1.indexOf("admin") == 8) {
			System.out.println("admin user is present");
		}
		else {
			System.out.println("FAIL");
		}
		
		System.out.println(str.indexOf('i'));//first occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1 ));//second occurrence of i
		
		System.out.println(str.indexOf("Python"));
		
		String m2 = "product name is macbook";
		if(m2.indexOf("macbook") != -1) {
			
		}
		
		//
		String test  = "this is java program";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());;
		
		//trim:
		String p = "       hello world       ";
		System.out.println(p.trim());
		
		//replace
		String p1 = "hello world";
		System.out.println(p1.replace(" ", ""));
		
		String dob = "01-01-1990"; //  ---> 01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String mesg = "I love Java";
		System.out.println(mesg.replace("love", "hate"));
		
		
		String q = "       hello world       ";
		System.out.println(q.replaceAll(" ", ""));
		
		//equals:
		String e1 = "hello selenium";
		String e2 = "hello Selenium ";
		System.out.println(e1.equals(e2));
		System.out.println(e1.equalsIgnoreCase(e2.trim()));
		
		//Contains:
		String tg = "welcome to naveen training";
		System.out.println(tg.contains("naveen"));
		if(tg.contains("naveen")) {
			System.out.println("enroll for it");
		}
		else {
			System.out.println("no need to enroll it");
		}
		
		//split:
		String lang = "JAVA_PYTHON_RUBY_DOTNET";
		
		String l[] =  lang.split("_");
		
		System.out.println(l.length);
		System.out.println(Arrays.toString(l));
		
		
		System.out.println("------------------");
		String pop = "xXtestingxXseleniumXxXautomationXXxXTrainingX";
		String n[] = pop.split("xX");
		System.out.println(n[0]); // ----> nothing
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		System.out.println(n[5]);




		

				
		


	
		
		
	}

}
