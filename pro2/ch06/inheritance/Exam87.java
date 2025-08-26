package ch06.inheritance;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 상속 - 함수재정의 (overriding)
 */

class EParents {
	protected int x;
	protected int y;

	// default 생성자
	public EParents() {}

	// 생성자 재정의
	public EParents(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void yonsan() {
		System.out.println("hap: " + (x + y));
	}

}

class ESon extends EParents {
	//default 생성자
	public ESon() {}

	public ESon(int x, int y) {
		super(x, y);
	}

	public void yonsan() {
		System.out.println("cha: " + (x - y));
	}
}

public class Exam87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EParents a = new EParents(20,30);
		a.yonsan();
		
		ESon b = new ESon(10, 20);
		
		b.yonsan();
	}

}
