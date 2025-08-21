package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제2 - 수 입력 받고 10보다 크고 20보다 작으면 출력 프로그램
 * if문으로 작성하기
 */
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력:");
		int num = sc.nextInt();
		
		if(num >= 0 && num < 10) {
			System.out.println("10보다는 작은 숫자입니다.");
		}else if(num >= 10 && num < 20) {
			System.out.println("10보다는 크고 20보다는 작은 숫자입니다.");
		}else {
			System.out.println("20보다 큰 숫자입니다.");
		}
	}

}
