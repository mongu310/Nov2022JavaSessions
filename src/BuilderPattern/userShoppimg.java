package BuilderPattern;

public class userShoppimg {

	public static void main(String[] args) {
		
		EcommApplication app = new EcommApplication();
		
		app.login("ae2004w@gmail.com", "summer#310W")
			.doSearch("macbook pro")
				.addToCart("macbook pro")
				 	.doPayment("1212 1212 1313 1444", 899)
				 		.generateOrder()
				 			.logout();
		
		System.out.println("----------");
		//
		app.login("ae2004w@gmail.com", "summer#310W")
			.doSearch("tshirt", 5000, "Nike")
				.addToCart("tshirt")
					.logout();
		
		System.out.println("----------");
		
		app.login("ae2004w@gmail.com", "summer#310W")
			.addToCart("tshirt")
				.doPayment("artem@hdfc")
					.generateOrder()
						.logout();
		
		System.out.println("----------");

		app.login("ae2004w@gmail.com", "summer#310W")
			.logout();
		
		
		
		//
		EcommApplication app1 = new EcommApplication();


		
		
		
		

	}

}
