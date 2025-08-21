package ch02.control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 반복을 활용한 표준 입출력
 */
public class Exam35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 수치 반복 : 초기값, 조건값, 증감값

		char ch1 = 0; // int a =0; double b = 0.0; char ch1 = 0; String str = null 또는 str = "";

		do { // key : y 반복, n 반복 종료
			System.out.println("Hello java!!");
			System.out.println("반복할래(y/n) : ");

			String str = sc.next(); // 문자열로 입력 받음
			ch1 = str.charAt(0); // 문자로 바꾸는 과정

			if (ch1 == 'n' || ch1 == 'N') {
				System.out.println("종료합니다.");
				break; // 반복문 탈출
			}

		} while (ch1 == 'y' || ch1 == 'Y');

		System.out.println();

		char ch2 = 0;
		while (true) { // while(1)
			for (int i = 1; i <= 5; i++) {
				System.out.println("오늘은 목요일입니다.");
			}
			
			System.out.println("종료를 원하면?(n/N)");
			String str = sc.next();
			ch2 = str.charAt(0);
			
			if (ch2 == 'n' || ch2 == 'N') {
				System.out.println("종료합니다.");
				break; // 반복문 탈출
			}
		}
		sc.close();
	}

}
