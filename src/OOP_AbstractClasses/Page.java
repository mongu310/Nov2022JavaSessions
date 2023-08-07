package OOP_AbstractClasses;

public abstract class Page implements Web {
	
	//2 + 2
	//0% abstraction: no abstract methods
	//x% abstraction: partial abstractions 
	//100% abstraction: all 
	
	//can not create the object of abstract class
	//but we can create the constructor of the abstract class
	//and it will be called when we create the object of child class
	
	public Page() {
		System.out.println("Page -- const...");
	}
	
	public Page(int i) {
		System.out.println("Page -- const..." + i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("Page -- lolo");
	}
	
	public void pageLoeadingTime() {
		System.out.println("Page leading tume 10 secs");
	}
	
	public static void pageCycle() {
		System.out.println("Page Cycle");
	}
	
	@Override
	public void privacyPolicy() {
		System.out.println("Login Page -- privacyPolicy");
	}

	

}
