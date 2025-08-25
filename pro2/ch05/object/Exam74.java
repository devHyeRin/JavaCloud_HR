package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 생성자 중복
 */
class AA {
	private int x;
	private int y;

	// default 생성자
	public AA() {
		x = 0;
		y = 0;
	}

	// 재정의된 생성자
	public AA(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA(10, 20);
		a.disp();

		AA b = new AA();
		b.disp();

		Test t = new Test();
		Test e = new Test(1, "홍길동", "123", 27, 159f);

//		AA b = new AA();		ERROR -> 재정의된 생성자가 있기 때문에 
		// 실무에서 생성자를 쓰든 안쓰든 default 생성자와 재정의된 생성자 2개를 만들어야 함
		// 기본 생성자는 매번 필요하기 때문에 기본 생성자를 꼭 만들어야 함
		// 위의 코드처럼 재정의된 생성자만 만들면 기본 생성자를 호출하고 싶어도 호출이 안됨

	}

}
