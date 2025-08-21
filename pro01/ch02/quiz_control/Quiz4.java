package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제4 - 입력한 인원 전체의 버스 요금 표시 프로그램 if문으로 작성하기
 */
public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 버스 인원");
		System.out.println("어른");
		int adult = sc.nextInt();
		System.out.println("청소년");
		int student = sc.nextInt();
		System.out.println("어린이");
		int child = sc.nextInt();
		
		int total = 0;

		if (adult >= 5) {
			total = 300 * adult + 200 * student + 50 * child;
		} else {
			total = 300 * adult + 200 * student + 100 * child;
		}

		System.out.println("총 인원 : 어른 " + adult + " 청소년 " + student + " 어린이 " + child);
		System.out.println("총 인원의 버스 요금 : " + total + "원");
	}

}
