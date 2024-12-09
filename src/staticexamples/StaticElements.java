package staticexamples;

public class StaticElements {

	
	//static - fixed
	
	//name of the school 
	// Principal
	// Class
	// Section
	// Subject
	// Roll No : xxx
	// TimeTable
	
	// Noun
	static String schoolName = "Ravindra Public School";
	// STRONGLY TYPED LANGUAGE 	
	
	double pi = 3.14; // 
	
	static String className = "X1";
	static String subject = "Physics";
	boolean isSunny;
    int rollNumber;
    
    public  void test() {
    	System.out.println("I am in static method");
    }
    
    public static void testStatic() {
    	System.out.println("I am in static testStatic");
    }
	
		
	public void callTest() {
		test();		
		testStatic();
		
		System.out.println();
	}
		
	
    public static void main(String[] args) {
    	
    	StaticElements se = new StaticElements();    		
    	se.test();		
    	
		testStatic();
	}
	

}
