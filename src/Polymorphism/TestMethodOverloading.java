package Polymorphism;

public class TestMethodOverloading {

	public static void main(String[] args) {
		
		int x1 = 5, x2 = 9;
		double y1 = 6 , y2 = 13.5;
		
		MethodOverloading k = new MethodOverloading();
		
		
		System.out.println("The sum of "+x1+" and "+x2+" using method signature 1 is "+k.add(x1, x2));
		System.out.println("The sum of "+y1+" and "+y2+" using method signature 1 is "+k.add(y1, y2));

	}

}
