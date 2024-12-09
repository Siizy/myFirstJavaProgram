package abstraction;

public class Hero extends MotorBike{

	@Override
	public void applyBrake() {
		System.out.println("Drum Brake");		
	}

	@Override
	public void start() {
		System.out.println("Switch Start");	
		
	}

	@Override
	public void stop() {
		System.out.println("Switch Stop");	
		
	}

	@Override
	public void turnOnHeadlight() {
		System.out.println("AI Voice");			
	}
	
	public void quadBike() {
		System.out.println("quadBike");			
	}
	
	public void abc() {
		System.out.println("abc in H");
	}
}
