package example;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("입력하세요: ");
		int N;
		N = input.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N - i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			if (i == N - 1) {
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i * 2 + 1; j++) {
					if (j == 0 || j == i * 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		input.close();
	}
}