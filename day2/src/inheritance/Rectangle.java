package inheritance;

public class Rectangle extends Figure {

	public Rectangle(int side1, int side2) {
		super(side1, side2);
	}
	@Override
	public double area() {
		return dim1 * dim2;
	}

}
