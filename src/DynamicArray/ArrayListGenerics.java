package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		
		System.out.println(numList.size());
		
		//for each loop:
		for(Integer e : numList) {
			System.out.println(e);
		}
		
		
		ArrayList<String> empNameList = new ArrayList<String>();
		
		empNameList.add("naveen");
		empNameList.add("tom");
		empNameList.add("peter");

		for(String e : empNameList) {
			System.out.println(e);
		}
		
		System.out.println(empNameList);
		
		
		//
		ArrayList<Object> empDataList = new ArrayList<Object>();
		
		empDataList.add("Tom");
		empDataList.add(20);
		empDataList.add(true);
		empDataList.add(12.33);
		empDataList.add('m');
		
		for(Object e: empDataList) {
			System.out.println(e);
				if(e.equals(20)) {
					System.out.println("fresher");
				}
		}
	
		
	}

}
