package shapePack;

public class Square extends Rectangle {

	public void printSquare() {
		System.out.println("This is Square. Subclass of Rectangle");
	}
	

	public float calculateArea(float side) {
		return super.calculateArea(side, side);
	}
}
