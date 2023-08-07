package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		//<k,v>
		//name = naveen
		//marks = 100
		//seller = seller@gmail.com
		//does not maintain the order
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
//		empMap.put(key, value)
		empMap.put("Naveen", "SDET");
		empMap.put("Amrita", "SDET1");
		empMap.put("Rashmi", "SDET2");
		empMap.put("Ravi", "SDET Manager");
		empMap.put("Kareen", "VP");
		empMap.put("Kareen", "CEO");
		empMap.put("Kareen", "CEO");
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");
		empMap.put(null, null);


		System.out.println(empMap.get("Rashmi"));
		System.out.println(empMap.get("Kareen"));
		System.out.println(empMap.get("Tom"));
		System.out.println(empMap.get("Sheela"));
		System.out.println(empMap.get("null"));
		
		System.out.println(empMap);//gives a random order
		
		System.out.println("------------");
		
		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();
		
		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		
		System.out.println(browserMap);

		System.out.println(browserMap.get("firefox"));






		
		
	}

}
