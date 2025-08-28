package ch05.object;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : final 변수, 함수
 */

class TestK{
	private final double PI = 3.141592;
	public static final int VALUE = 20;
	
	public double getPI() {
		return PI;
	}
	
	public void setPI(double PI) {
//		this.PI = PI;		ERROR -> PI는 final 변수이기 때문에 값을 변경할 수 없음
	}
	
	public static void aa() {
//		System.out.println(PI);			ERROR -> static 함수에는 static 변수, 함수만 가능
		System.out.println(VALUE);
	}
	
	public void bb() {
		System.out.println(PI);
		System.out.println(VALUE);
	}
	
	public final void cc() {}			//final 함수는 상속을 못해줌
	public static final void dd() {}
}

public class Exam80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
