package recursion;
import java.util.*;
public class Example {
	
	static int count = 0;
	static int x1=0, x2=1, x3=0;
	// Simple recursive method
	public void m() {
		count++;
		if(count <= 5) {
			System.out.println("Am a recursive method m within class Example");
	     	m();
		}
		
	}

	public static void main(String[] args) {
		
		Example e = new Example();
		Scanner input = new Scanner(System.in);
		e.m();
		
		System.out.println("Enter number and see its factorial");
		int num = input.nextInt();
		System.out.println("The factorial of "+num+" is "+e.factorial(num));
		input.close();
		
		System.out.println(x1+""+x2);
		GenerateSeries(13);
	}
	
	// Method that computes factorial of a number
	
	public int factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	// Method that computes fibonacci series
	
	static void GenerateSeries(int count) {
		
		if(count > 0) {
			x3 = x1 + x2;
			x1 = x2;
			x2=x3;
			System.out.println(""+x3);
			GenerateSeries(count-1);
		}
	}
	
	
	

}
