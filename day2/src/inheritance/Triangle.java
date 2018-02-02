package inheritance;

public class Triangle extends Figure {

	public Triangle(int base, int height) {
		super(base, height);
	}
	@Override
	public double area() {
		return 0.5 * dim1 * dim2;
	}

}
