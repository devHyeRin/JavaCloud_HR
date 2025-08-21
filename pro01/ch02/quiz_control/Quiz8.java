package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제8 - 영문자를 대문자로 변환
 */
public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자 입력 : ");
		String str = sc.next();
		char ch = str.charAt(0);

		System.out.println("입력한 영문자 : " + str);
		System.out.println("대문자로 변환 : " + (char)(ch-32));
	}
}
