package loops;

public class SwitchCase {

	public void switchCaseEx(String day) {

		//String day = "Wednesday";

		if (day == "Sunday") {
			System.out.println("Today is : Sunday");
			
		}
		if (day == "Monday") {
			System.out.println("Today is : Monday");
		}
		if (day == "Tuesday") {
			System.out.println("Today is : Tuesday");
		}
		if (day == "Wednesday") {
			System.out.println("Today is : Wednesday");
		}
		if (day == "Thursday") {
			System.out.println("Today is : Thursday");
		}
		if (day == "Friday") {
			System.out.println("Today is : Friday");
		}
		if (day == "Saturday") {
			System.out.println("Today is : Saturday");
		} 
	
	}

	public static void main(String[] args) {
 
		SwitchCase sw = new SwitchCase();
		sw.switchCaseEx("Thursday");
		
	}

}
