package ch05.object;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 생성자 중복 객체를 만들 때 객체마다 필요한 생성자가 다를 때 - 여러개의 생성자
 */

class TestD {
	private int x;
	private int y;

	public TestD() {
		x = 10;
		y = 20;
	}

	public TestD(int x) {
		this.x = x;
		y = 55;
	}

	public TestD(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestD a = new TestD();
		a.disp();
		
		TestD b = new TestD(44);
		b.disp();
		
		TestD c = new TestD(1, 2);
		c.disp();
		
	}

}
