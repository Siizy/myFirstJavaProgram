package testpackage;

public class Calculator {
	
	//variables
	 int age = 24;
	// type name = data
	   String naam = "John";   
	   String city;
	
	// java is a strongly typed language
	   
	   //declarinig a variable
	   String address = "5944 Shelford Terrace"; // initializing a variable
	
	// addition (no parameter)
	 public void addition() {
		 System.out.println("Addition is : " + 25);
	 }
	
	
	// substraction - parameterised method
	 public void subtraction(int num1, int num2) {
		 System.out.println(num1 - num2 );
		 Calculator c1 = new Calculator();
		 System.out.println(c1.age);
	 }
	
	// divide numbers
	public void divide() {
		System.out.println("Division is : " + 5);	
		
	}
	 
	// multiplication
	public void multiply() {
		System.out.println("Multiplication is : " + 5);
	}
	
	
	public static void main(String[] args) {
      
		Calculator calc = new Calculator();
		//calc.subtraction();
        calc.addition();
             
        System.out.println(calc.naam);
		
	}
}
