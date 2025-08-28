package ch05.object;

class TestF {
	private int x; // 정수
	private float y; // 실수
	private String z; // 문자열(클래스) ->객체
	private int[] a;

	// 기본 생성자
	public TestF() {
	}

	// 재정의된 생성자
	public TestF(int x, int y, String z, int[] a) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.a = a;
	}
}

public class Exam77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] su = new int[] { 1, 2, 3, 4, 5 };
		TestF f = new TestF(10, 20, "apple", su);

	}

}
