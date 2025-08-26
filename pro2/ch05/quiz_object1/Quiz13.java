package ch05.quiz_object1;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제13 - 절대값 구하기
 */

class ABS{
	public int result;
	public int value;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void resultAbs() {
		//Math 클래스 사용하지 않는 방법
//		if(value < 0) {
//			result = -value;
//		}
		
		//Math 클래스 사용한 방법 - 자바 api
		result = Math.abs(value);		//절대값 구하기
	}
	
	public void disp() {
		System.out.println("result: " + result);
	}
}

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABS abs = new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}

}
