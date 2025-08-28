package ch06.inheritance;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 생성자 상속
 */

class BParents {
	protected int x;
	protected int y;

	public BParents() {
		System.out.println("부모 기본 생성자");
	}

	public BParents(int x) { // x = 10
		this.x = x;
		this.y = 20;
	}

	public BParents(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class BSon extends BParents {
	private int z;

	public BSon() {
		super(); // 생략가능 -> (default 생성자 실행 ) 부모의 생성자 출력됨
		System.out.println("자식 기본 생성자");
	}

	public BSon(int x) { // 10
		super(x); // super(10) -> 부모 생성자 매개변수 x에 10이 전달됨
		this.z = 30;
	}

	public BSon(int x, int y, int z) {
		super(x, y); // 부모의 default 생성자 호출
		this.z = z;
	}

	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z);
	}
}

public class Exam85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSon a = new BSon();
		
		BSon b = new BSon(10);
		b.disp();
		
		BSon c = new BSon(100, 200, 300);
		c.disp();
	}

}
