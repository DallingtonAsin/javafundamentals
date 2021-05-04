// Types of inheritance: single, multilevel and hierarchical

/*
  When a class inherits another, its called single inheritance
  
  When there is a chain of inheritance, it's called multilevel inheritance
 */

public class Son extends Father{
	
	public double height = 7.88;

	public void saySomethingSon() {
		Son s = new Son();
		System.out.println("My children will extend my father's skin color which is "+s.skinColor);
	}

}
