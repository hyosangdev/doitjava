package example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100 ~ 91 A등급
 * 90 ~ 81 B등급
 * 80 ~ 71 C등급
 * 나머지는 F등급
 */
public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("국어 점수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		c = sc.nextInt();

		int sum = a + b + c;
		double avg = sum / 3.0;

		System.out.print("평균 점수는" + avg + "이고 ");
		if (avg >= 91) {
			System.out.println("A등급 입니다.");
		} else if (avg >= 81) {
			System.out.println("B등급 입니다.");
		} else if (avg >= 71) {
			System.out.println("C등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
		sc.close();
	}
}