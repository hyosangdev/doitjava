package example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100 ~ 91 A���
 * 90 ~ 81 B���
 * 80 ~ 71 C���
 * �������� F���
 */
public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("���� ������ �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		c = sc.nextInt();

		int sum = a + b + c;
		double avg = sum / 3.0;

		System.out.print("��� ������" + avg + "�̰� ");
		if (avg >= 91) {
			System.out.println("A��� �Դϴ�.");
		} else if (avg >= 81) {
			System.out.println("B��� �Դϴ�.");
		} else if (avg >= 71) {
			System.out.println("C��� �Դϴ�.");
		} else {
			System.out.println("F��� �Դϴ�.");
		}
		sc.close();
	}
}