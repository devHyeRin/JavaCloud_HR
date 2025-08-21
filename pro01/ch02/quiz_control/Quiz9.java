package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제9 - 키보드 입력해서 최대값 출력
 */
public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력");
		int a = sc.nextInt();
		System.out.println("숫자2 입력");
		int b = sc.nextInt();
		System.out.println("숫자3 입력");
		int c = sc.nextInt();
		
		int max = 0;
		
		if(max < a) {
			max = a;
		}
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		System.out.println("최대값 : " + max);
	}

}
