package abstractTest1Pack;

public abstract class ABC {

	ABC() {
		System.out.println("\nInitializing ABC Class");
	}
	
	void FOO() {
		System.out.println("FOO");
	}
	
	abstract String DAY();
}
