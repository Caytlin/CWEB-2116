package abstraction;

import java.util.Scanner;

public class Utility {

	Scanner input = new Scanner(System.in);
	
	public String CheckForName(String animalType) {
		System.out.print("Do you have a name for " + animalType + "? (Y/N): ");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("Y")) {
			System.out.print("Enter the name: ");
			return input.nextLine();
		}
		else {
			return null;
		}
	}
	
	public Lion getLionObject(String lionName) {
        return lionName != null ? new Lion(lionName) : new Lion();
    }

    public Giraffe getGiraffeObject(String giraffeName) {
        return giraffeName != null ? new Giraffe(giraffeName) : new Giraffe();
    }

    public Bear getBearObject(String bearName) {
        return bearName != null ? new Bear(bearName) : new Bear();
    }

}
