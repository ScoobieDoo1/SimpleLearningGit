package calculator;

public class Calculations {
	
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double sub(double a, double b) {
		return a-b;
	}
	
	public double division(double a, double b) {
		return a/b;
	}
	
	public double multiplication(double a, double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
		Calculations cal = new Calculations();
		
		double resultAdd=cal.add(100,50.99);
		System.out.println("Addition:"+resultAdd);
		
		double resultSub=cal.sub(100.99, 50.25);
		System.out.println("Subtraction:"+resultSub);

		
		double resultDiv=cal.division(200.99, 50.99);
		System.out.println("Division:"+resultDiv);

		
		double resultMul=cal.multiplication(45.00, 99.99);
		System.out.println("Multiplication:"+resultMul);

	}

}
