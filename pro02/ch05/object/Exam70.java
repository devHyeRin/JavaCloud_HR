package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 생성자
 */
//하나의 클래스 안에 여러개의 클래스를 만들 경우 public으로 지정하면 안됨
//메인 하나만 public으로 지정해야 함
//컴파일 하면 bin에서 TestA와 TestB가 만들어짐

class TestA{
	//함수 -> 접근제한자 지정예약어(static, final, 생략) 반환형 함수명(매개변수 목록)
	//생성자 -> 접근제한자 생성자명은 클래스명과 동일(매개변수 동일)
	public TestA() {		//기본 생성자
		System.out.println("hi");
	}
}

class TestB{
	public TestB() {
		System.out.println("안녕하세요.");
	}
}

class TestC{
	private int x;			//this.x = 0
	private int y;			//this.y = 0
	private int z;			//this.z = 0
	
	//생성자가 없을 경우 default 생성자 실행되면서 멤버변수가 0으로 초기화 됨
	public TestC(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}

public class Exam70 {		//실행 클래스만 public >> 하나의 자바 파일에 여러개의 클래스 사용할 때 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a = new TestA();		//a 객체 생성되었다. -> 내부적으로 생성자 생김
		
		TestB b = new TestB();		//b 객체 생성되었다.	-> 내부적으로 생성자 생김
		
		//생성자로 전달
		TestC c = new TestC(10, 20, 30);		//매개변수 지정하면 default 생성자가 아님
		
		//멤버 함수 전달
		//점 연산자로 전달 private
		c.disp();
	}

}
