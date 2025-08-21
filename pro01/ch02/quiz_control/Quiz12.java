package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제12 - 10개의 정수 입력받고 양수와 음수의 개수 구하기
 */
public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int plusCount = 0;
		int minusCount = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("수를 입력하세요 : ");
			num = sc.nextInt();
			if(num >= 0) {
				plusCount++;
			}else if(num < 0) {
				minusCount++;
			}
		}
		System.out.println("양수개수 : " + plusCount);
		System.out.println("음수개수 : " + minusCount);
	}

}
