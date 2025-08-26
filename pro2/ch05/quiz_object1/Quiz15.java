package ch05.quiz_object1;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제15
 */

class Printer {

	public void println(int a) {
		System.out.println(a);
	}

	public void println(boolean a) {
		System.out.println(a);

	}

	public void println(double a) {
		System.out.println(a);

	}

	public void println(String a) {
		System.out.println(a);

	}
}

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
