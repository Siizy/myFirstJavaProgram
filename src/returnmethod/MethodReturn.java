package returnmethod;

public class MethodReturn {



	/**
	 * adds two numbers and returns the sum
	 * @param num1
	 * @param num2
	 * @return sum
	 * @author chandan
	 */
	public int add(int num1, int num2) {

		int c = num1 + num2;
		System.out.println("Addition is : " + c);

		return c;

	}

	public void substract(int num1, int num2) {

	}

	public String getState(String city1, String city2) {

		String state;

		if (city1 == "Pune") {

			state = "Maharashtra";
		}

		else if (city2 == "Nagpur") {

			state = "Maharashtra";
		} else {
			state = "Not Maharashtra";
		}

		return state;

	}

	public static void main(String[] args) {

		MethodReturn mr = new MethodReturn();
		int total = mr.add(2, 3);
		System.out.println("Total is : " + total);

		String myState = mr.getState("Pune", "Nagpur");
		System.out.println("State is : " + myState);
	}

}
