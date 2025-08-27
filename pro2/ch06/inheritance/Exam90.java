package ch06.inheritance;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 상속
 * 함수 재정의 : 상속받아서 함수를 다 재정의 >> 자식입장
 * 							자식을 제어(컨트롤)할 수 있다 >> 부모입장
 * UpCasting / DownCasting
 */

class Person{
	protected String message;
	
	public void setData(String message) {
		this.message = message;
	}
	
	public String getData() {
		return message;
	}
}

class Student extends Person{			//message, getData(), setData() 함수 재정의
	public void setData(String message) {
		super.message = message;
		
		System.out.println("Student setData Method...");
		System.out.println(message);
	}
}

public class Exam90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//부모 클래스
		Person p = new Person();
		p.setData("부모입니다.");
		System.out.println(p.getData());
		System.out.println();
		
		//자식클래스
		Student s = new Student();
		s.setData("자식입니다");
		s.getData();
		System.out.println();
		
		
		//UpCasting : 자식클래스가 부모클래스 타입으로 변환 >> 자동변환
		Person stu = new Student();			//message, getData(), 자식 setData()
		stu.setData("UpCasting");
		System.out.println();
		
		//부모클래스가 자식클래스 타입으로 변환 >> 명시적 변환
		//Student ss = new Person();		ERROR -> 형변환 해줘야 함    
		//byte c = (byte) a
		//Student ss = (Student) new Person();		ERROR -> 컴파일할 때 에러남
		
		//DownCasting : 업캐스팅된 것을 다시 원래로 되돌리는 것
		Student t = (Student) stu;
		t.setData("DownCasting");
		
		
	}

}
