package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제6 - 키보드 입력 문자 화면 표시 프로그램 if문으로 작성하기
 */
public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요(M/m or W/w)");
		String str = sc.next();
		char ch = str.charAt(0);
		String gender = "";
		
		if(ch == 'M' || ch == 'm') {
			gender = "man";
		}else if(ch == 'W' || ch == 'w') {
			gender = "woman";
		}else {
			System.out.println("???");
		}
		
		System.out.println(gender);;
			
	}

}
