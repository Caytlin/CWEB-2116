package abstractTest1Pack;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter greeting: ");
		String greetInput = scanner.nextLine();
		XYZ xyz = new XYZ();
		xyz.FOO();
		System.out.println(xyz.GreetWithDAY(greetInput));
	}

}
