package ch06.quiz_inheritance;

/**
 * 날짜 : 2025. 8. 30.
 * 작성자 : 이혜린
 * 내용 : 문제29 - 다이어그램, 메인화면, 결과화면 참조해서 프로그램 작성
 */

abstract class Student{
	protected int hakbunho;
	protected String name;
	protected String major;
	
	public Student(int hakbunho, String name, String major) {
		this.hakbunho = hakbunho;
		this.name = name;
		this.major = major;
	}
}

class StudentAddress extends Student{
	private String phone;
	private String addr;
	
	public StudentAddress(int hakbunho, String name, String major, String phone, String addr) {
		super(hakbunho, name, major);
		this.phone = phone;
		this.addr = addr;
	}
	
	public void disp() {
		System.out.println("학번 : " + super.hakbunho);
		System.out.println("이름 : " + super.name);
		System.out.println("학과 : " + super.major);
		System.out.println("전화번호 : " + this.phone);
		System.out.println("주소 : " + this.addr);
	}
}

public class Quiz29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAddress s = new StudentAddress(123456, "홍길동", "소프트웨어", "010-123-1234", "서울시 강남구");
		s.disp();
		
	}

}
