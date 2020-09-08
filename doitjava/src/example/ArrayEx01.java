package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		char[] arry1 = new char[26];
		arry1[0] = 97;

		for (int i = 0; i < arry1.length; i++) {
			arry1[i] = (char) (97 + i);
		}
		System.out.println(arry1);
	}
}