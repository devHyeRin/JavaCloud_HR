package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제3 - 두 개의 수를 입력받아서 그 중 큰 수 출력 프로그램
 * if문으로 작성하기 
 */
public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 숫자 입력:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		}else if(num1 < num2) {
			System.out.println(num2);
		}else {
			System.out.println("같은 숫자입니다.");
		}
	}

}
