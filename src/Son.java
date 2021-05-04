// Types of inheritance: single, multilevel and hierarchical

/*
  When a class inherits another, its called single inheritance
  
  When there is a chain of inheritance, it's called multilevel inheritance
  
  When 2 or more classes inherit a single class, it is known as hierarchical inheritance
  
  Multiple inheritance is not supported in java: To reduce the complexity and simplify the language
  
  Sub class or derived class or child class or extended class: a class that is derived from another class
  super class or parent class or base class: a class from which the sub class is extended from
  
 */

public class Son extends Father{ // subclass of super class Father
	
	public double height = 7.88;

	public void saySomethingSon() {
		Son s = new Son();
		System.out.println("My children will extend my father's skin color which is "+s.skinColor);
	}

}
