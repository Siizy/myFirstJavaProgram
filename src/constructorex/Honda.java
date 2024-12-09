package constructorex;

public class Honda extends MotorBike {

	Honda(String comp, int cc) {
		System.out.println(comp + " " + cc);
		System.out.println("==============");
	}

	Honda() {
		super("abc", 123);
		System.out.println("");
	}
}
