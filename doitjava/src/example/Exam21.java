package example;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڴ� �����ΰ���?");
		int com = (int) (Math.random() * 100) + 1;

		for (int i = 1;; i++) {
			System.out.print("1~100 ������ ���� �Է��ϼ���: ");
			int user = sc.nextInt();
			if (user < com) {
				System.out.println("High(up)");
			} else if (user > com) {
				System.out.println("Low(down)");
			} else if (user == com) {
				System.out.println(i + "ȸ ���� ����");
				break;
			}
		}
	}
}
