package chapter08;

public class DmbCellphoneEx {

	public static void main(String[] args) {
		//DmbCellphone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정",100);
		//Cellphone으로부터 상속 받은 필드
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		//DmbCellphone의 필드
		System.out.println("채널: " + dmbCellphone.channel);
		//Cellphone으로부터 상속 받은 메소드
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellphone.sendVoice("바쁘니 나중에 전화주세요.");
		dmbCellphone.hangUp();
		//DmbCellphone의 메소드
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(10);
		dmbCellphone.turnOffDmb();
	}
}