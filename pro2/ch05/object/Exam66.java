package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : Exam66.java / Pay.java 
 * 클래스 변수 접근 방법 >> 데이터 전달 
 * 1.  .(점) 연산자 obj.name = "홍길동"
 * 	2. 멤버 함수
 * 3. 생성자 
 * 
 */
public class Exam66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pay a = new Pay();
		a.input("왕눈이", 2000000);
		a.yonsan();
		a.output();
		
		Pay b = new Pay();
		b.input("아로미", 1000000);
		b.yonsan();
		b.output();
		
		Pay c = new Pay();
		c.input("투투", 15000000);
		c.yonsan();
		c.output();
	}

}
