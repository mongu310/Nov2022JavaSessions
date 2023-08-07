package SeleniumSessions;

public class Student {
	
	//WAF:
	//give the studentName(String) as a parameter
	//return the student marks(int)
	
	public int getStudentMarks(String studentName) {
		
		System.out.println("getting student marks for : " + studentName);
		
			if(studentName.equals("Neha")) {
				return 100;
			}
			
			else if(studentName.equals("Somesh")) {
				return 90;
			}
			
			else if(studentName.equals("Amin")) {
				return 80;
			}
			else {
				System.out.println("student is not found...");
				return -1;
			}
	}
	
	
	 
	

	public static void main(String[] args) {
		
		Student st = new Student();
		int m1 = st.getStudentMarks("Tom");
		System.out.println(m1);
		if(m1==-1) {
			System.out.println("no need to print marksheet");
		}
		
		
		
		
		

	}

}
