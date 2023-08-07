package OOP_AbstractClasses;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP -- cpnsta...");
	}
	
	public LoginPage(int i) {
		System.out.println("LP -- cpnsta..." + i);
	}

	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");
	}
	
	public void resetPWD() {
		System.out.println("LP -- reset PWD");
	}
																																														
	@Override
	public void pageLoeadingTime() {
		System.out.println("Page leading tume 5 secs");
	}
	
	public static void pageCycle() {
		System.out.println("Login Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("Login Page -- privacyPolicy");
	}

}
