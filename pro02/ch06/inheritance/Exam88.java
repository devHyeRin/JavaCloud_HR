package ch06.inheritance;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 상속 - 함수 재정의 (Overriding)
 */

class Airplane{
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
}

class SupersonicAirplan extends Airplane{		//fly(), takeOff(), land()
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	private int flayMode = NORMAL;
	
	public void setFlayMode(int flayMode) {
		this.flayMode = flayMode;
	}
	
	public void fly() {		//fly 함수 재정의
		if(flayMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();     // 부모의 fly() 실행		//this.fly()
		}
	}
}

public class Exam88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplan sa = new SupersonicAirplan();
		sa.takeOff();
		sa.fly();		//일반 비행
		
		sa.setFlayMode(SupersonicAirplan.SUPERSONIC);		//초음속 비행
		sa.fly();
		
		sa.setFlayMode(SupersonicAirplan.NORMAL);		//일반 비행
		sa.fly();
		sa.land();
	}

}
