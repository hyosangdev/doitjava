package example;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
		sc.close();
	}
}