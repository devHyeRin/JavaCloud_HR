package ch05.quiz_object1;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제14 - getter 메소드 데이터 값 1씩 증가
 */

class Plus {
	private int a;
	private int b;

	public void setX(int a) {
		this.a = a;
	}

	public void setY(int b) {
		this.b = b;
	}

	public int getX() {
		return ++a;
	}

	public int getY() {
		return ++b;
	}

}

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plus p = new Plus();
		p.setX(10);
		p.setY(20);

		System.out.println("x : "+ p.getX() + ", y :" + p.getY());
	}

}
