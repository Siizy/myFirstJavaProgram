package loops;

import ifelse.TestClass;

public class ForLoop {

	// loop - goes on and on
	// if condition is true, loop it
	// for loop, while loop, do-while loop, Enhanced Loop (Advance loop)
	
	// i++ means i=i+1

	public void printNumbers() {

		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i is : " + i);
			
			if(i==5) {
				break;
			}			
			
			System.out.println("I am in loop");
		}
		
		System.out.println("I am outside loop");
	// break and continue	
		
	}
	
	// nested for loop
	
	
	public static void main(String[] args) {
			
		new ForLoop().printNumbers();
		
		
	}
	
	
	

}
