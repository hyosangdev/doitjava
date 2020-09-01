package example;

public class Exam03 {

	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		while(i <= 10) {
			j += i++;
		}
		System.out.println("1에서 10까지의 합은 " + j + " 입니다.");
	}
}
