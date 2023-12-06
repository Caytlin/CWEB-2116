package abstraction;

public class TestMain {

	public static void main(String[] args) {

		System.out.println("ANIMAL'S PROPERTIES");
		
		Utility utility = new Utility();
				
		String lionName = utility.CheckForName("Lion");
		Lion lion = utility.getLionObject(lionName);
		lion.displayAll();
		System.out.println("------------------\n");
		
		String giraffeName = utility.CheckForName("Giraffe");
		Giraffe giraffe = utility.getGiraffeObject(giraffeName);
		giraffe.displayAll();
		System.out.println("------------------\n");
		
		String bearName = utility.CheckForName("Bear");
		Bear bear = utility.getBearObject(bearName);
		bear.displayAll();
		System.out.println("===================================");
	}

}
