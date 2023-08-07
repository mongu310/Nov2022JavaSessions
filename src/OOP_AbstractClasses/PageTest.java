package OOP_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageLoeadingTime();
		lp.resetPWD();
		
		Page.pageCycle();
		LoginPage.pageCycle();
		lp.pageCycle();
		
		//top casting:
		//child class object can be referred by abstract parent class ref variable:
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageLoeadingTime();
		
		//down casting - NA
		
		
		
		
		
		
	}

}
