package example;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڴ� �����ΰ���?");
		int com = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		while (true) {
			for (int i = 1;; i++) {
				System.out.print("1~100 ������ ���� �Է��ϼ���: ");
				int user = sc.nextInt();
				System.out.println((++cnt) + "ȸ �Է��ϼ̽��ϴ�.");
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
}
