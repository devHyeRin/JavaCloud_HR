package ch04.quiz_function;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제12 - 출력값 보고 프로그램 완성 (call by name)
 */
public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outAtoZ();
		out1to100();
		sum1to100();
	}

	public static void outAtoZ() {
		char ch = 'A';
		for (int i = ch; i < 'Z'; i++) {
			System.out.print(ch++);
		}
		System.out.println();
	}

	public static void out1to100() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void sum1to100() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

}
