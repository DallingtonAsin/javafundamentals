package Polymorphism;
/* Method overriding is one way of implementing polymorphism (runtime polymorphism) */

public class TestMethodOverriding {

	public static void main(String[] args) {
		
		Animal a;
		
		a = new Cow();
		a.eatChoice();
		
		a = new Dog();
		a.eatChoice();
		

	}

}
