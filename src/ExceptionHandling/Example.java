package ExceptionHandling;

public class Example {
	
	public void divide(double a, double b) {
		double result;
		try {
			result =  a / b; 
			System.out.println("The result of "+a+" / "+b+" is "+result);
			
		}catch(Exception ex) {
			 System.out.println("Caught exception "+ex.getMessage());
		}finally {
			System.out.println("Trying to demonstrate exception handling");
		}
		
	}

	public static void main(String[] args) {
		
		Example example = new Example();
		
		example.divide(70, 0);

	}

}
