package example;

import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		//���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���
		//switch case ������ ����ؾ� �մϴ�.
		System.out.print("���� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		switch (aa) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("���� ������ ���ڴ� 31�� �Դϴ�.");
			break;
		case 2:
			System.out.println("���� ������ ���ڴ� 29�� �Դϴ�.");
			break;
		default:
			System.out.println("���� ������ ���ڴ� 30�� �Դϴ�.");
			break;
		}
	}
} 