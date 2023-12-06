package shapePack;

public class Rectangle extends Shape {

	public void printRectangle() {
		System.out.println("This is Regtangle. Subclass of Shape.");
	}
	
	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}
}
