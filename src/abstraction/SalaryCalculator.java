package abstraction;

public class SalaryCalculator {
	
	double gross;
	double rate;

	public static void main(String[] args) {
		
		Nurse n = new Nurse();
		Doctor d = new Doctor();
		SalaryCalculator sc = new SalaryCalculator();
		
		sc.gross = 500000;
		sc.rate = 8;
		
		System.out.println("Doctors's salary is " + d.getSalary(sc.gross, sc.rate));
		System.out.println("Nurse's salary is " + n.getSalary(sc.gross, sc.rate));

	}

}
