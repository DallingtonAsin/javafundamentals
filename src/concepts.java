
import java.util.*;
public class concepts {
	
	public String name;
	public int age;

	public static void main(String[] args) {
		
		concepts obj = new concepts();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		obj.name = input.nextLine();
		System.out.println("Enter your age");
		obj.age = input.nextInt();
		
		System.out.print("The entered name is "+obj.name+" and age is "+obj.age);
		input.close();
		
	}

}
