package chapter04;

public class Loopexample {

	public static void main(String[] args) {
//		int dan;
//		int times;
		for (int i = 2; i <= 9; i++) {
			for (int times = 1; times <= 9; times++) {
				System.out.println(i + " X " + times + " = " + i * times);
			}
			System.out.println();
		}
	}
}
