package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제5 - 다이어트 결정 프로그램 if문으로 작성하기
 */
public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게 입력 : ");
		double weight = sc.nextDouble();
		System.out.println("키 입력 : ");
		double height = sc.nextDouble();;
		
		if(weight > (height - 100) * 0.9) {
			System.out.println("다이어트가 필요합니다.");
		}else {
			System.out.println("다이어트가 필요하지 않습니다.");
		}
	}

}
