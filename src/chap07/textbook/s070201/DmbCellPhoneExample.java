package chap07.textbook.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// DmbCellPhone 객체생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone ("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속받은 필드 
		System.out.println("모델: " + dmbCellPhone.modell );
		System.out.println("색상: " + dmbCellPhone.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		// CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		// DmbCellPhoned의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannerlDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}

