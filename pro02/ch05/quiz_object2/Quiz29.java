package ch05.quiz_object2;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제29 - 임의의 수 입력 받아서 사칙연산
 */

class Yonsan {
	private int su;
	private int value;
	private char buho;
	private int resultInt;
	private float resultFloat;
	private Scanner sc;

	public void input() {
		sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		su = sc.nextInt();

		System.out.print("부호를 입력하세요 : ");
		String buho = sc.next();
		this.buho = buho.charAt(0);

		System.out.print("수를 입력하세요 : ");
		value = sc.nextInt();

		sc.close();
	}

	public void yonsan() {
		if (buho == '+') {
			resultInt = su + value;
		} else if (buho == '-') {
			resultInt = su - value;
		} else if (buho == '*') {
			resultInt = su * value;
		} else if (buho == '/') {
			resultFloat = (float) su / value;
		} else {
			System.out.println("부호 잘못 입력");
		}
	}

	public void disp() {
		if (buho == '/') {
			System.out.println(su + " " + buho + " " + value + " = " + resultFloat);
		} else {
			System.out.println(su + " " + buho + " " + value + " = " + resultInt);
		}
	}
}

public class Quiz29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yonsan y = new Yonsan();
		y.input();
		y.yonsan();
		y.disp();

	}

}
