package ch04.quiz_function;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제14 - '1'을 입력할 경우 "우린 천생연분인가 봐!!" 출력 / '2'을 입력할 경우 "꺼져!!" 출력
 */
public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("나 사랑해? (1 : YES OR 2 : NO) : ");
		int num = sc.nextInt();

		choose(num);

		sc.close();
	}

	public static void choose(int num) {
		if (num == 1) {
			System.out.println("우리는 천생연분인가봐!!");
		} else if (num == 2) {
			System.out.println("꺼져!!");
		} else {
			System.out.println("1과 2만 입력 가능");
		}
	}

}
