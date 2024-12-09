package constructorex;

public class Bajaj extends MotorBike {
		
	Bajaj() {
		System.out.println("Bajaj Constructor");
		System.out.println("==============");
	}

	Bajaj(String comp, int cc) {
		System.out.println(comp + " " + cc);
		System.out.println("==============");
	}
}
