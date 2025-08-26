package ch04.quiz_function;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제19 - 두 수를 입력 받아 교환하는 함수 생성, swap 함수는 두개의 실제 매개변수를 전달함으로써 호출 (call by value)
 */
public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int num1 =  sc.nextInt();
		System.out.print("수를 입력하세요 : ");
		int num2 =  sc.nextInt();
		
		System.out.println("현재값\t\t a:" + num1 + "\t\t b:" +num2);
		swap(num1, num2);
	}
	
	public static void swap(int num1, int num2) {
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("교환된 값\t a:" + num1 + "\t\t b:" +num2);
		
		
	}

}
