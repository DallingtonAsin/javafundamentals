
/*
 Encapsulation is the process of wrapping code and data together into a single unit 
 e.g a capsule which is mixed of several medicines
 
 A java class which is fully encapsulated has a private data member and getter and setter methods
 
 
 */

public class encapsulation {
	
	private String name;
	
	public void setName(String _name) { // setter method
		this.name = _name;
	}
	
	public String getName() { // getter method
		return name;
	}
	

	public static void main(String[] args) {
		
		encapsulation enc = new encapsulation();
	
		 enc.setName("Dallington Asingwire");
		 System.out.println("My name is "+enc.getName());

	}

}
