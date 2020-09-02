package example;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성된 숫자는 무엇인가요?");
		int com = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		while (true) {
			for (int i = 1;; i++) {
				System.out.print("1~100 사이의 값을 입력하세요: ");
				int user = sc.nextInt();
				System.out.println((++cnt) + "회 입력하셨습니다.");
				if (user < com) {
					System.out.println("High(up)");
				} else if (user > com) {
					System.out.println("Low(down)");
				} else if (user == com) {
					System.out.println(i + "회 만에 정답");
					break;
				}
			}
		}
	}
}
