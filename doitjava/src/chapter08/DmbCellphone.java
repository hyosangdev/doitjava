package chapter08;

public class DmbCellphone extends Cellphone {
	//�ʵ�
	int channel = 0;
	
	//������
	DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �����մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
}
