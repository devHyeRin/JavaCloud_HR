package ch04.function;

/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 이혜린
 * @설명 : final 상수 / 지역, static
 */
public class Exam61 {
	public static final int VALUE = 99;			//static final 상수 변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SU = 77;
//		SU = 88;   				error : 값을 변경할 수 없는 변수 -> final 상수
		System.out.println(SU);
		System.out.println(VALUE);
	}
	
	public final void aa() {}
	public static final void bb() {}
	public void cc() {}
}
