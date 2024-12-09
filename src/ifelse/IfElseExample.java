package ifelse;

 public class IfElseExample {
	
	final String name = "Daisy";
	
	public String allowPerson(String person) {
		
		
		// if it is a male >> go left
	    // else if it is a female, go right
		//others, free to go ;
		
		String washroom ;
		
		if(person == "male") 
			washroom = "Left";			
		   
		else if(person == "female") 
			washroom = "Right";
		
		else 
			washroom = "Free to Go";					
		
		return washroom;
		
		
		
		
	}
	
	
	final void add() {
		
		System.out.println("dfgdjk");
		
		}
	
   
	public static void main(String[] args) {
		
		
		String washroomDirection = new IfElseExample().allowPerson("pRAKASH");
		
		System.out.println("Washroom is on to the : " + washroomDirection);		
	}

}
