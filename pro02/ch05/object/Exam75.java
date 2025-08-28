package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 생성자 호출 - this()
 */

class TestY {
	private int x, y, z;
	private int a;

	// 기본생성자 - this 생략 가능
	public TestY() {
		x = 100;
		y = 200;
		z = 300;
		a = 400;
	}

	public TestY(int x) {
		// 기본생성자와 겹치는 부분
//		this.x = x;
//		y = 200;
//		z = 300;
//		a = 400;

		this(); // 겹치는 부분 생성자 호출 : this()
		this.x = x;
	}

	public TestY(int x, int y) {
		//호출방법1
//		this.x = x;
//		this.y = y;
//		z = 300;
//		a = 400;

		//호출방법2
//		this();
//		this.x = x;
//		this.y = y;
		
		//호출방법3
		this(x);
		this.y = y;
	}
}

public class Exam75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
