package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제11 - 총합과 평균 구하기
 */
public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 수를 입력받겠습니까? ");
		int num = sc.nextInt();
		int number = 0;
		int sum = 0;
		
		
		for(int i = 0; i < num; i++) {
			System.out.println("수를 입력하세요: ");
			number = sc.nextInt();
			sum += number;
		}
		
		double avg = sum / num;
		System.out.println("sum: " + sum + "\t avg : " + avg);
	}

}
