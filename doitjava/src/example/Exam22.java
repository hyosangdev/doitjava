package example;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		//달의 마지막 일자를 출력하는 프로그램을 작성하세요
		//switch case 구문을 사용해야 합니다.
		System.out.print("달을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		switch (aa) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("달의 마지막 일자는 31일 입니다.");
			break;
		case 2:
			System.out.println("달의 마지막 일자는 29일 입니다.");
			break;
		default:
			System.out.println("달의 마지막 일자는 30일 입니다.");
			break;
		}
	}
} 