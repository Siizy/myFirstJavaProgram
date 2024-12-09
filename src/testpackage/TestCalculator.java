package testpackage;

public class TestCalculator {

	double deci = 23.4576543788;
	float flt = 34.56154863f;

	long nums = 236542364897l;

	boolean isPassed = false;

	char num = 9;
	char num2 = '9';
	char dd = 'a';
	char d2 = 'A';

	Calculator cald = new Calculator();
	Calculator cald2 = new Calculator();
	Calculator cald3 = new Calculator();

	Calculator Long = new Calculator();

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.addition();
		calc.subtraction(100, 20);
	}

	public static void main2() {

		Calculator calc = new Calculator();
		calc.addition();
		calc.subtraction(100, 20);
		
	}

}
