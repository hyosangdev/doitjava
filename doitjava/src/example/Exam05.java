package example;

public class Exam05 {

	public static void main(String[] args) {
		int j = 0;
		for(int i = 1; i <= 50; i++) {
			if(i%3 == 0) {
				j += i;
			}
		}
		System.out.println(j);
	}
}
