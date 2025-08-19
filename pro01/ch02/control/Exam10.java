package ch02.control;
/*
 * 제어문 - 조건문 (if, switch ~ case) / 반복문 (for, while, do ~ while)
 * 				- 조건문(if)
 * 				- if(조건식){
 * 						실행문장들
 * 					}
 * */

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		if(x > 10) {	// 20 > 10  -> if(1)
			System.out.println("10보다 큰 수입니다.");
		}
		
		System.out.println();
		
		int y = 110;
		if(y > 0 && y < 100) {		// 110 > 0 && 110 < 100	(T && F - > F (실행x))
			y += 200;
			System.out.println(y);
		}
		
	}

}
