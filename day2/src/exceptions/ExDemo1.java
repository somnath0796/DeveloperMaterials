package exceptions;

public class ExDemo1 {
	public static void main(String[] args) {
		
		try{
			int a  = 20;
			int b = 0;
			double d = a/b;
			System.out.println("No Exception...");
		}catch(NullPointerException e){
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println(e);
		}finally {
			System.out.println("Normal Flow Resumed...");
		}

		System.out.println("Okay Bye.");
	}
}
