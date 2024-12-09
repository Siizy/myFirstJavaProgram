package mypackage;

public class ClassJava01 {

	//variable
	String name = "Chandan";
	int age = 23;
	
	//method - verb
	public void test() {
		System.out.println("Hello World !!");
		System.out.println("Hello World Again !!");
	}
	
	public static void main(String[] args) {		
			
		ClassJava01 obj = new ClassJava01(); 
		
		obj.test();
		
		//obj.name;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		//ClassJava01 obj = new ClassJava01(); 
	}
}


