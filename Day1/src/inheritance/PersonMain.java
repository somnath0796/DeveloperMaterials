package inheritance;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Emp e  = new Emp(100, "Somnath",56000);
		System.out.println(e.showDetails());
		
		System.out.println(new Trainee(101, "Holande", 20000, "Great").showDetails());
	}
}
