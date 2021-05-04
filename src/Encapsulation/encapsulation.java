package Encapsulation;

/*
 Encapsulation is the process of wrapping code and data together into a single unit 
 e.g a capsule which is mixed of several medicines
 
 A java class which is fully encapsulated has a private data member and getter and setter methods
 A java class which read only class or write only class
 
 
 */

public class encapsulation {
	
	private String name;
	
	public void setName(String _name) { // setter method
		this.name = _name;
	}
	
	public String getName() { // getter method
		return name;
	}
	/* You can write as many functions as you can by trying different return types
	  but still following the convention of encapsulation
	*/

	public static void main(String[] args) {
		
		encapsulation enc = new encapsulation();
	
		 enc.setName("Dallington Asingwire");
		 System.out.println("My name is "+enc.getName());

	}

}
