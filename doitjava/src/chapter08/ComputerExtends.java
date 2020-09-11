package chapter08;

public class ComputerExtends extends CalculatorExtends {
	@Override	//컴퓨터 주석
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI * r * r;
	}
}