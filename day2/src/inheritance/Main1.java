package inheritance;

public class Main1 {

	public static void main(String[] args) {
		Figure ref = null;
		
		Triangle t = new Triangle(20, 10);
		Rectangle r = new Rectangle(30, 60);
		
		ref = t;
		System.out.println(ref.area());
		ref = r;
		System.out.println(ref.area());

	}

}
