package inheritance;

public class Computer extends Calculator {

	
	double areaCircle (double r) {
		System.out.println("areaCircle() executing from Calculator");
		return Math.PI * r * r;
	}
	
	public double superAreaCircle (double r) {
		System.out.println("areaCircle() executing throgh super");
		return super.areaCircle(r);
	}
}
