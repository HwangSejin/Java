package inheritance;

public class SmartPhone extends Phone {

	public SmartPhone (String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("Web searching");
	}
}
