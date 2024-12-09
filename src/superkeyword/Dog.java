package superkeyword;

public class Dog extends Animal {

	int age = 2;
	String name = "tessy";
	
    Dog() {
        	
		super("Convirous");	
	}

	Dog(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	String breed = "Dog Breed";

	public void eat() {
		System.out.println(breed);
		System.out.println(super.breed);
		
	}

	public static void main(String[] args) {
		
		Dog dog3 = new Dog();
		
		
		
	}
}