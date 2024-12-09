package loops;

public class SwitchCase2 {

	public String switchCaseEx(String day) {

		String finalDay;
		
		switch (day) {

		case "Sunday": {
			finalDay = "Sunday";
			break;
		}

		case "Monday": {
			finalDay = "Monday";
			break;
		}

		case "Tuesday": {
			finalDay = "Tuesday";
			break;
		}
		case "Wednesday": {
			finalDay = "Wednesday";
			break;
		}
		case "Thursday": {
			finalDay = "Thursday";
			break;
		}
		case "Friday": {
			finalDay = "Friday";
			break;
		}
		case "Saturday": {
			finalDay = "Saturday";
			break;
		}
		
		default:{
			finalDay = "You are not from Earth";			
		   }
		}
		
		return finalDay;
	}

	public static void main(String[] args) {
		SwitchCase2 sw = new SwitchCase2();				
		
		String today = sw.switchCaseEx("saturday");		
		System.out.println(today);
	}

}
