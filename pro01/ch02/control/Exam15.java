package ch02.control;

/*
 * 제어문 - 조건문 (if, switch ~ case) / 반복문 (for, while, do ~ while)
 * 				- 조건문(if ~ else if)
 * 				- if(조건식1){
 * 						문장들
 * 					} else if(조건식2){
 * 						문장들
 * 					} else if(조건식3){
 * 						문장들
 * 					}
 * 					....
 * */
public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 73;
		
		if(score >= 90) {
			System.out.println("점수가 100 ~ 90 입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score >= 80) {
			System.out.println("점수가 89 ~ 80 입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score >= 70) {
			System.out.println("점수가 79 ~ 70 입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D입니다.");
		}

	}

}
