package chapter08;

public class Student extends People {
	//�ʵ�
	public int StudentNo;
	
	//������
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //�θ������ ȣ��
		this.StudentNo = studentNo;
	}
}
