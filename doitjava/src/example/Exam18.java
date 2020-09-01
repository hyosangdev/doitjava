package example;

import java.util.Scanner;

public class Exam18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요: ");
		int N;
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				if (j == 0 || j == i * 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < N; i++) {
			for (int j = N - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				if (j == 0 || j == i * 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

