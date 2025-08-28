package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 클래스 3대 특성
 * 은닉화(캡슐화), 중복성, 상속성(재정의)
 */
public class Exam68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saram saram = new Saram();
		
		// . 연산자 접근, 함수 접근
		//이 방식은 쓰지 말기
		saram.name = "홍길동";
		saram.address = "서울시 강남구 역삼1동";
		saram.phoneNumber = "010-123-1234";
//		s.juminBunho = "12345-1234567";			//error : private 변수로 생성됨
		saram.setJuminBunho("12345-1234567");
		saram.age = 27;
	}
	
}
