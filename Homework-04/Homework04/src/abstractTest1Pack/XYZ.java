package abstractTest1Pack;

public class XYZ extends ABC {

	@Override
	String DAY() {
		return "THURSDAY";
	}
	
	String GreetWithDAY(String greeting) {
		return greeting + " " + DAY();
	}
}
