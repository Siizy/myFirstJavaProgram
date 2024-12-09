package abstraction;

public class TestClass {

	public static void main(String[] args) {
		
		MotorBike mb = new Hero();
		mb.ride();
		mb.applyBrake();		
		mb.abc();
		
		mb = new Bajaj();
		
		mb.abc();
		
		mb.applyBrake();	
		mb.stop();
		mb.ride();
		//mb.quadBike();
	}
}
