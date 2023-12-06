package shapeProcess;

import shapePack.*;

public class ShapeExecute {

	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.printShape();
		sq.printRectangle();
		sq.printSquare();
		
		System.out.println("---------------");
		
		SemiCircle SemiCir = new SemiCircle();
		SemiCir.printShape();
		SemiCir.printSemiCircle();
		SemiCir.printCircle();
		
	}

}
