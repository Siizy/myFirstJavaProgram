package abstraction;

public class Bajaj extends MotorBike{

	public  void applyBrake() {
		System.out.println("Disc Brake + Manual Brake");
	}

	
	public void start() {		
		System.out.println("Kick Start");
	}

	
	public void stop() {
		System.out.println("Twist Key");
		
	}

	public void turnOnHeadlight() {
		System.out.println("Press On button");
		
	}
	
	public void absBrake() {
		System.out.println("apply absBrake");
	}
	
	public void abc() {
		System.out.println("abc in Bajaj");
	}
}
