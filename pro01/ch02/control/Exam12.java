package ch02.control;

/*
 * 제어문 - 조건문 (if, switch ~ case) / 반복문 (for, while, do ~ while)
 * 				- 조건문(if ~ else)
 * 				- if(조건식){
 * 						참일 때 실행
 * 					} else{
 * 						거짓일 때 실행
 * 					}
 * */
public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -25;
		if (a > 0) { // -25 > 0 -> (F) (else 실행)
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}

		// 삼항 연산자로 표현
		String str = a > 0 ? "양수" : "음수";
		System.out.println(str);

		if (a % 2 == 0) { // -25%2 == 0 -> (F) (else 실행)
			a += 100;
			System.out.println("짝수입니다." + a);
		} else {
			a *= 200;
			System.out.println("홀수입니다." + a);
		}
	}

}
