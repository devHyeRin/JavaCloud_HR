package ch04.function;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 함수 - Call by Name -> 함수 이름을 호출하는 방식 
 * 프로그램은 두가지로 구성 
 * 데이터 : 자료형 활용해서 변수, 배열
 * 데이터 처리 (기능) : 함수
 * 
 * 클래스 : 데이터 + 기능
 * 
 * 함수 디버깅 방법 : 함수 안으로 F5 / 함수 밖으로 F7
 */
public class Exam46 {

	public static void main(String[] args) {				//main -> 컴파일러가 호출해주는 함수
		// TODO Auto-generated method stub
		//4개의 함수 중에 제일 먼저 호출되는 함수가 main()
		//접근제한자 지정예약어 반환타입 함수명(매개변수목록)
		
		sub();
		//안녕하세요 출력하는 부분이 공통적이니까 함수로 호출하기
//		System.out.println("안녕하세요");
		System.out.println("hahahaha");
//		System.out.println("안녕하세요");
		sub();
		System.out.println("hohohoho");
//		System.out.println("안녕하세요");
		sub();
		System.out.println("end!!");
	}
	
	public static void sub() {
		System.out.println("안녕하세요");
	}
	
}
