package chapter05;

public class CalcStatic {
	static double pi = 3.14159;	//���� ���
	int num1 = 10;	//�ν���Ʈ ���
	int num2 = 20;	//�ν���Ʈ ���
	
	static int plus(int x, int y) {	//���� ���
		return x + y;
	}
	
	static int minus(int x, int y) { //���� ���
		return x - y;
	}
	static int multiply(int x, int y) { //�ν��Ͻ� ���
		return x * y;
	}
}