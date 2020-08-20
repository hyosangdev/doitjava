package chapter04;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서 입력받은 숫자가 홀수인지 짝수인지
 * 출력하세요.
 */
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int e = sc.nextInt();
			if (e % 2 == 0) {
				System.out.println("입력한 숫자는 짝수 입니다.");
			} else {
				System.out.println("입력한 숫자는 홀수 입니다.");
			}
			sc.close();
	}

}
