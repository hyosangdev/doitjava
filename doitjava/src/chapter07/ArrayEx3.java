package chapter07;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 10���� �Է��� �� �ִ� �迭�� �����ϰ� 1���� 10���� ������ ��
		// for���� ����ؼ� �հ踦 ����ϼ���. (55)
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println(sum);
	}
}