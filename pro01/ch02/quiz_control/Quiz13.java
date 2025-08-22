package ch02.quiz_control;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요:");
		int year = sc.nextInt();
		
		if(year %100 == 0) {
			System.out.println( year+"년도는 평년입니다.");
		}else {
			if(year % 400 == 0) {
				System.out.println(year +"년도는 윤년입니다.");
			}
		}
	}

}
