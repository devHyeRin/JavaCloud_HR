package ch03.quiz_array;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제10 - 요일로 초기화된 문자열 배열 day로 선언하고 정수를 입력받아 7로
 * 나눈 나머지를 인덱스로 하여 배열에 저장된 문자를 출력하기
 */
public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		
		for
		(int i = 0; i < day.length; i++) {
			System.out.println(num%day.length);
			if(num%day.length == i) {
				System.out.println(day[i]);
			}
		}
		sc.close();
	}

}
