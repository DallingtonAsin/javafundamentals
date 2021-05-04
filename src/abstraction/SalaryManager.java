package abstraction;

public interface SalaryManager {
	
	public final double allowance = 5000;
	public abstract double getSalary(double gross, double rate);

}
