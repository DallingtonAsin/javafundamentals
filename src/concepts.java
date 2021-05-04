/*

List of Java Fundamentals implemented here

1. Inheritance
2. Abstraction
3. Encapsulation
4. Polymorphism
5. Exception Handling


*/
import java.util.*;
public class concepts {
	
	public String name;
	public int age;

	public static void main(String[] args) {
		
		concepts obj = new concepts(); // Object creation / class instantiation
		Scanner input = new Scanner(System.in); // Read input from keyboard
		
		System.out.println("Enter your name");
		obj.name = input.nextLine();
		System.out.println("Enter your age");
		obj.age = input.nextInt();
		
		System.out.print("The entered name is "+obj.name+" and age is "+obj.age);
		input.close();
		
	}

}
