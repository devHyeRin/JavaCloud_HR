package ch04.function;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 함수 - Call by name
 */
public class Exam48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 하나를 입력:(1~3):");
		int x = sc.nextInt();

		if (x == 1) {
			aa();
		} else if (x == 2) {
			bb();
		} else if (x == 3) {
			cc();
		}
		System.out.println("end");

		sc.close();
	}

	public static void aa() {
		System.out.println("AA() Function");
	}

	public static void bb() {
		System.out.println("BB() Function");

	}

	public static void cc() {
		System.out.println("CC() Function");
	}
}
