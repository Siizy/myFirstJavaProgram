package constructorex;

public class MotorBike {
	
	 String company;
	 int cc;

	MotorBike() {
		this.company = "Silver";		
		this.cc = 345;
		//System.out.println("Motorbike constructor");
	}

	MotorBike(String company, int cc) {		
		this.company = company;		
		this.cc = cc;
	}
		
	public void ride() {
		System.out.println("Bike ride");
	}

	public static void main(String[] args) {
		
		MotorBike mbo = new MotorBike();
		MotorBike mboo = new MotorBike();
		MotorBike mb = new MotorBike("Jabe", 1200);			
		MotorBike mbt = new MotorBike("Jane", 1222);	
		MotorBike mb3 = mb.test();
		System.out.println(mb3.company +" "+ mb3.cc);
	}
		
	
	public MotorBike test() {
		//System.out.println("VSF");
		MotorBike mb2 = new MotorBike("Baaj", 456);
		System.out.println(this.cc);
		return this; // this refers to the object of the current class
	}
}
