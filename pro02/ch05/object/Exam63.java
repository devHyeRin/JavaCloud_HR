package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 클래스
 * Exam63.java / Person.java
 */
public class Exam63 {		// 메인함수를 가지고 있는 클래스 : 실행 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체1
		Person a = new Person();
		a.name = "홍길동";
		a.age = 23;
		a.ki = 182.2f;
		a.disp();
		
		//객체2
		Person b = new Person();
		b.name = "김길동";
		b.age = 33;
		b.ki = 177.7f;
		b.disp();
		
		//객체3
		Person c = new Person();
		c.name = "박길동";
		c.age = 22;
		c.ki = 168.7f;
		c.disp();
	}

}
