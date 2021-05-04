// Types of inheritance: single, multilevel and hierarchical

/*
  When a class inherits another, its called single inheritance
 */

public class Son extends Father{

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("The son extends father skin color which is "+s.skinColor);
		System.out.println("The son says "+s.eat());

	}

}
