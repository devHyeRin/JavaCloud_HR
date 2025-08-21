package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제7 - 세 정수 입력 받아 10이하의 수만 더하기 if문으로 작성하기
 */
public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = 0;
		
		if(num1 <= 10) {
			sum += num1;
		}
		if(num2 <= 10) {
			sum += num2;
		}
		if(num3 <= 10) {
			sum += num3;
		}
		System.out.println(num1 + " " + num2 + " " + num3 );
		System.out.println("합계 : " + sum);

	}

}
