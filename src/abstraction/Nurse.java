package abstraction;

public class Nurse implements SalaryManager {
	public double getSalary(double gross, double rate) {
		  return gross + (0.5*allowance);
	  }
}
