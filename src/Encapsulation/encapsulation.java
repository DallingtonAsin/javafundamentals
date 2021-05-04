package Encapsulation;


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
