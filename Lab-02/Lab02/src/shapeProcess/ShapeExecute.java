package shapeProcess;

import shapePack.*;
import java.util.Scanner;

public class ShapeExecute {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Square sq = new Square();
		sq.printShape();
		sq.printRectangle();
		sq.printSquare();
		
		System.out.println("\nArea of Square:");
		System.out.print("Enter the measurement of a side: ");
		float side = input.nextFloat();
		System.out.println("RESULT: Area of Square = " + sq.calculateArea(side));
		
		System.out.println("\nArea of Rectangle:");
		System.out.print("Enter the measurement of the length: ");
		float length = input.nextFloat();
		System.out.print("Enter the measurement of the breadth: ");
		float breadth = input.nextFloat();
		System.out.println("RESULT: Area of Rectangle = " + sq.calculateArea(length, breadth));
		
		System.out.println("\n---------------");
		
		SemiCircle SemiCir = new SemiCircle();
		SemiCir.printShape();
		SemiCir.printSemiCircle();
		SemiCir.printCircle();
		
	}

}
