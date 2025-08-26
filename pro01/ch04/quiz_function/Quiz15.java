package ch04.quiz_function;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제15 - 입력한 숫자만큼 별 출력 프로그램 (call by value)
 */
public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("별 수를 입력하세요. : ");
		int num = sc.nextInt();
		
		subStar(num);
		
		sc.close();
	}
	
	public static void subStar(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}

}
