package abstraction;

public abstract class MotorBike {

	// Abstraction =>
	// wall
    
	String petroltank;
	int cc;
	
	public abstract void applyBrake();

	public abstract void start();

	public abstract void stop();

	public abstract void turnOnHeadlight();
	
	public static void ride() {
		System.out.println("Go forward");
	}
	
	public abstract void abc();
}
