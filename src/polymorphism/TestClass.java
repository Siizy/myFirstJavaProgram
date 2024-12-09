package polymorphism;

public class TestClass {

	public static void main(String[] args) {
			
        Dog dg = new Dog();       
        dg.run();
        dg.eat();
		
        Animal ani = new Dog();        
        ani.run();
        ani.eat();
        
        GermanSheford gs = new GermanSheford();       
        gs.sleep();

	}

}
