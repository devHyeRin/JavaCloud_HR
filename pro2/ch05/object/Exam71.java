package ch05.object;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 생성자로 데이터 전달 - Exam70 코드 사용자 입력으로 바꾸기
 * 
 */
class BirthdayB {
	private int year;
	private int month;
	private int day;
	private String name;
	private Scanner sc;

	// 함수, 생성자
	public BirthdayB() {
		sc = new Scanner(System.in);
		System.out.println("이름: ");
		name = sc.next();					//this.name = sc.next(); -> this 생략 가능
		System.out.println("연도: ");
		year = sc.nextInt();
		System.out.println("월: ");
		month = sc.nextInt();
		System.out.println("일: ");
		day = sc.nextInt();
	}

	public void disp() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(name);
		System.out.println();
	}

}

public class Exam71{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthdayB b = new BirthdayB();
		b.disp();
	}

}
