package abstraction;
/* 
    Abstraction is a process of hiding implementation details and showing
    only functionality to the user E.g when you type and send a message, you don't
    know about the internal processing about the message delivery
    
    There are 2 ways to achieve abstraction in java 
    1. Abstract class
    2. Interface
    
    Points to remember
    1. Abstract class must be declared with an abstract keyword
    2. It can have abstract and non-abstract methods
    3. It cannot be instantiated
    it can have constructors and static methods too
    it can have final methods which force a subclass not to change the body of the method
    
    Rule: if there is an abstract method in a class, that class must be abstract
    
    *
    */
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
