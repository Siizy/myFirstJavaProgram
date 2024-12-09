package superkeyword;

public class Animal {
	
	String breed = "General";

	Animal(){
		  System.out.println("I am in Animal Constructor");	
		}
	
	Animal(String type){
		  System.out.println("Animals are " + type);	
		}
	
	public void eat() {
		System.out.println("Animal eat");
	}
	
	public void jump() {
		System.out.println("Animal jump");
	}
}
