package accessmodifiers;

public class PrivateEx {

	private int age = 34;
	String name = "Sita";

	private void eat() {
		System.out.println("I am in private");
	}

	public static void main(String[] args) {

		PrivateEx px = new PrivateEx();
		px.eat();
	}

}
