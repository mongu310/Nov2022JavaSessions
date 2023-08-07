package SeleniumSessions;

import java.util.Arrays;

public class Customer {
		
		//WAF:
		//getEmployeeDevices (empName -- String)
		//return device list
		
		public String[] getEmployeeDevices(String empName) {
			System.out.println("getting devices information for employee: " + empName);
			
			if(empName.equals("Ravi")) {
			String devices[] = {"macbook pro", "ipad", "iph13"};
			return devices;
			}
			
			else if(empName.equals("Om")) {
				String devices[] = {"Windows 10", "Samsung s10"};
				return devices;
			}
		
			else if(empName.equals("Rashmi")) {
				String devices[] = {"Windows 10", "Samsung s10", "iphone13", "Airtel SIM"};
				return devices;
			}
			else {
				System.out.println("emp name is not found....");
				return null;
			}
		
		}
	
	

	public static void main(String[] args) {
		
		Customer obj = new Customer();
		String d[] = obj.getEmployeeDevices("Ravi");
		System.out.println(Arrays.toString(d));
		System.out.println(d.length);
		

		
		
		
		
	}

}
