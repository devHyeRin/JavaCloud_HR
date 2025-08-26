package ch04.quiz_function;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제13 - 출력값 보고 프로그램 완성 (call by value)
 */
public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outChar('A');
		outDec(32767);
		outFloat(98.54f);
	}

	public static void outChar(char ch) {
		System.out.println(ch);
	}

	public static void outDec(int num) {
		System.out.println(num);
	}

	public static void outFloat(float num) {
		System.out.println(num);
	}

}
