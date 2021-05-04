package abstraction;

public abstract class Bank {
  
	public final double addOn = 1.55; // constant
	public abstract double computerBankInterest(); // abstract method
	
	// Non-abstract method
	public void whoami() {
		System.out.println("Simple demonstration of computing interest in a bank using abstraction");
	}
	
	// final method: can not be changed by the subclass
	
	public final String getBankSeniorDeveloper() {
		return "Dallington Asingwire";
	}
	
	
}
