package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array: static array: size is fixed 
		//collection of elements with the same type
		
		//limitations of array:
		//1. size is fixed: static array: to overcome this issue, we have to use dynamic array (ArrayList)
		//2. only similar type of data can be stored: to overcome this issue, we have to use Object static Array
		
		
		
//		lowest index = 0
//		length = 4
//		highest index = length - 1
//		length = highest index + 1
		int i[] = new int[4];
		
		System.out.println(i.length);
		int len = i.length;
		int hi = len - 1;
		int li = 0;
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//AIOB
		//System.out.println(i[-1]);//AIOB
		
		System.out.println("--------------------");
		
		//to print all the values from array:=
		//index based loop:
		for(int k = 0; k<=i.length-1; k++) {
			System.out.println(i[k]);//10, 20, 30, 40
		}
		
		System.out.println("--------------------");
		
		//to print all the values from array without loop:
		System.out.println(Arrays.toString(i));
		
		System.out.println("--------------------");
		
		//for each:
		for(int e : i) {
			System.out.println(e);
				if(e==20) {
					System.out.println("Bye!!");
					break;
				}
		}
		//
		System.out.println("--------------------");
		
		System.out.println(i);//trash
		//System.out.println(i[6]);
		
		int p[] = new int[4];
//		p[2] = 30;
//		System.out.println(p[0]);
//		System.out.println(p[2]);
//		System.out.println(p[3]);
		
		System.out.println("--------------------");
		
		//2. double array:
		double d[] = new double[4];
		d[0] = 12.22;
		d[1] = 23.44;
		d[2] = 34.55;
		d[3] = 45.66;
		System.out.println(d[0] + d[1]);
		
		System.out.println(Arrays.toString(d));
		
		for(double e : d) {
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		
		//char:
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		
		System.out.println(ch.length);
		System.out.println(ch.length-1);
		System.out.println("li = " + 0);
		
		for(char e : ch) {
			System.out.println(e);// System.out.println((int)e); for ascii values
		}
		
		System.out.println("--------------------");
		
		//
		//default valu eof a string is null
		//String array:
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JavaScript";
		lang[3] = "DotNet";
		
		System.out.println(lang.length);
		
		for(String e : lang) {
			System.out.println(e);
			if(e.equals("Java")) {
				System.out.println("i love Java");
			}
			if(e.equals("JavaScript")) {
				System.out.println("I hate JS");
			}
			
		}
		
		System.out.println("--------------------");
		
		//Object Array:
		//Object is a class in Java -- is a super class of all classes in Java
		
		//Employee Info: name (String), age (int), salary (double), gender (char), isPermanent (boolean) 
		Object emp[] = new Object[5];
		emp[0] = "Rashmi";
		emp[1] = 25;
		emp[2] = 25.55;
		emp[3] = 'f';
		emp[4] = true;
		
		System.out.println(emp.length);
		for(Object e : emp) {
			System.out.println(e);
				if(e.equals("Rashmi")) {
					System.out.println("emp is from QA");
				}
		}
		
		System.out.println("--------------------");
		
		Object emp1[] = new Object[5];
		emp1[0] = "Artem";
		emp1[1] = 24;
		emp1[2] = 25.44;
		emp1[3] = 'm';
		emp1[4] = false;
		
		for(int m=0; m<=emp1.length-1; m++) {
			System.out.println(emp1[m]);
			if(emp1[m].equals("Artem")) {
				System.out.println("emp is from Dev");
			}
		}
		
		System.out.println("--------------------");
		
		
		//static:
		//1. new keyword
		//2. array literals
		int num[] = {1,2,3,4,5,6,234,4756};// 1 = 0 & 4756 = 6
		System.out.println(num.length);
		
		System.out.println("--------------------");
		
		
		String product[] = new String[10];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JavaScript";
		lang[3] = "DotNet";
		
		String pr[] = {"macbook", "iphone", "samsung"};
//		System.out.println(pr[3]);
		
		Object data[] = {"macbook", 1000, 23.44, 'g', true};
		for(Object e : data) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(pr));
		

		


		
		
		
		
		
		
	}

}
