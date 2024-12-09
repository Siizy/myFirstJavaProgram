package calculator;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		if (calc.add(2, 3) == 5)
			System.out.println("Add test passed");
		else
			System.out.println("Add function test failed ");
		
		if (calc.substract(5, 3) == 2)
			System.out.println("Substract test passed");
		else
			System.out.println("Substract function test failed ");
	}
}




