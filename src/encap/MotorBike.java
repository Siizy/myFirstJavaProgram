package encap;

public class MotorBike {

	// Encapsulation
    // data hiding - Encapsulation helps to achieve data hiding
	// CAPSULE

	int cc;	
	private String handle = "Straight";
	
	String headlight,brake, seat, mirror, suspension, switchKey;
	

	private void applyBrake() {
		System.out.println(brake);
	}

	public void turnEngineON() {
		System.out.println(switchKey);
		System.out.println(cc);
	}
	
	

}
