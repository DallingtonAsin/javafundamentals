package abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		// Bank a = new Bank(); // This is wrong because you cannot instantiate an abstract class
		
		Bank a = new BankA();
		a.whoami(); // calling non-abstract method from abstract class
		System.out.println("Our senior bank dev is "+a.getBankSeniorDeveloper()); // call a final method from abtsract class
		System.out.println("The interest for bank A is "+a.computerBankInterest());
		
	     Bank b = new BankB();
		System.out.println("The interest for bank A is "+b.computerBankInterest());

	}

}
