package ch02.quiz_control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 문제10 - 대출금 월이자 계산 프로그램
 */
public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("기간 입력 : ");
		int period = sc.nextInt();
		System.out.println("대출금 입력 : ");
		double money = sc.nextDouble();
		double total =0;
		
		if(period == 7) {
			total = (int)(money * 0.0725)/12;
		}else if(period == 15) {
			total = (int)(money * 0.085)/12;
		}else if(period == 30) {
			total = (int)(money * 0.09)/12;
		}else {
			total = 0;
		}
		
		System.out.println("대출금:" + money + "\t 월이자: " + total);
	}

}

