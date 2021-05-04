package abstraction;

public class Doctor implements SalaryManager {
	
  public double getSalary(double gross, double rate) {
	  return (100+rate)*0.01*gross + allowance;
  }

}
