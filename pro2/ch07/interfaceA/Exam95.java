package ch07.interfaceA;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 멤버변수, 지역변수, 매개변수/리턴
 */

class AA {
	public int x;

	public void disp() {
		int y = 20;
	}

	public void aa(int su) {
	} // su : 지역변수

	public int bb() {
		int value = 20;

		return value;
	}
}

class BB {
	// 클래스를 변수로 선언하면 멤버 객체를 가질 수 있음
	public AA a; // x, disp(), aa(), bb()
	public String str;
	public Scanner sc;
	
	public void output() {
		a = new AA();
		a.disp();
		a.aa(10);
		a.bb();
	}
	
	public void apple() {
		//지역 객체
		AA a = new AA();
		Scanner sc = new Scanner(System.in);
	}
	
	public void banana(AA a) {}		//매개변수로 클래스가 넘어감
	
	public AA melon() {
		AA a = new AA();
		return a;					//객체가 리턴 -> 반환형도 객체
	}
}

public class Exam95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		
		BB b = new BB();
		b.banana(a);			//banana() 함수는 매개변수가 객체로 지정되어있기 때문에 객체생성 후 객체를 던짐
		AA aa =  b.melon();		//melon() 함수의 반환형이 객체이므로 값을 담을 때 클래스로 담아야 함
	}

}
