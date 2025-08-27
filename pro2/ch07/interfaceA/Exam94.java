package ch07.interfaceA;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : interface
 * 내부적으로 public static final 상수, public abstract 함수로 구성
 */

interface XX {
	public int SU = 20; // 변수 : static final 이 default

	public void disp(); // 함수 : 추상함수(abstract)
}

class YY implements XX {
	protected int x;

	@Override
	public void disp() {
		System.out.println("Hi");
	}

	public void output() {

	}

}

class ZZ extends YY{}	//YY를 상속받았기 때문에 XX, YY 클래스에 있는 변수, 함수 사용 가능

interface Test extends XX{}

public class Exam94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		XX x = new XX();		인터페이스는 객체 생성 불가능
		YY y = new YY();
		y.disp();
		y.output();
		
		XX x = new YY();
		x.disp();
//		x.output();		부모는 자식 고유의 함수는 접근하지 못함

	}

}
