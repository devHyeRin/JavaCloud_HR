package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제1 : 숫자 하나를 입력 받아 그 수가 1이면 "남성", 2이면 "여성" 글자 출력 프로그램
 * switch ~ case문으로 작성하기
 */
public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 (1 or 2) :");
		int num = sc.nextInt();
		String gender = "";
		
		switch(num) {
		case 1:
			gender = "남성";
			break;
		case 2:
			gender = "여성";
			break;
		default:
			System.out.println("1 또는 2만 입력해주세요.");
			break;
		}
		
		System.out.println(gender);
	}

}
