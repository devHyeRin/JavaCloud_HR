package ch04.quiz_function;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제18 - 수 두개를 입력받아 max 함수 생성하고 호출하기
 * max 함수는 두개의 숫자 중 최대값을 찾는 함수 ( call by value)
 */
public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num1 =  sc.nextInt();
		System.out.print("수를 입력하세요 : ");
		int num2 =  sc.nextInt();
		
		max(num1, num2);
	}
	
	public static void max(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1 + "가 큽니다.");
		}else if(num1 < num2) {
			System.out.println(num2 + "가 큽니다.");
		}else {
			System.out.println("두 수는 같은 수 입니다.");
		}
	}

}
