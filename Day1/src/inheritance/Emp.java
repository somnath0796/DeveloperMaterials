package inheritance;

public class Emp extends Person{

	private double salary;
	
	public Emp(int id, String name, double salary) {
		super(id,name);
		this.salary= salary;
	}
	
	@Override
	public String showDetails(){
		
		return super.showDetails()+ " "+this.salary;
	}
	
}
