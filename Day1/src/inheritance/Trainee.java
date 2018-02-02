package inheritance;

public class Trainee extends Emp{
	private String performance;
	
	public Trainee(int id, String name, double Salary, String Performance) {
		super(id,name, Salary);
		this.performance = Performance;
	}
	
	@Override
	public String showDetails() {
		return super.showDetails() + " " + this.performance;
	}
}
