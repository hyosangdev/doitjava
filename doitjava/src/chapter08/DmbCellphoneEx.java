package chapter08;

public class DmbCellphoneEx {

	public static void main(String[] args) {
		//DmbCellphone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���", "����",100);
		//Cellphone���κ��� ��� ���� �ʵ�
		System.out.println("��: " + dmbCellphone.model);
		System.out.println("����: " + dmbCellphone.color);
		//DmbCellphone�� �ʵ�
		System.out.println("ä��: " + dmbCellphone.channel);
		//Cellphone���κ��� ��� ���� �޼ҵ�
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellphone.sendVoice("�ٻڴ� ���߿� ��ȭ�ּ���.");
		dmbCellphone.hangUp();
		//DmbCellphone�� �޼ҵ�
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(10);
		dmbCellphone.turnOffDmb();
	}
}