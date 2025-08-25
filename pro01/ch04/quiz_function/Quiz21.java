package ch04.quiz_function;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Su : ");
		int num1 = sc.nextInt();

		System.out.print("Input buho : ");
		String cul = sc.next();

		System.out.print("Input Value : ");
		int num2 = sc.nextInt();

		int result = 0;

		switch (cul) {
		case "+":
			result = plus(num1, num2);
			break;
		case "-":
			result = minus(num1, num2);
			break;
		case "*":
			result = culcu(num1, num2);
			break;
		case "/":
			result = div(num1, num2);
			break;
		default:
			System.out.println("부호를 잘못 입력");
			break;
		}
		System.out.println(num1 + cul + num2 + "=" + result);
		
	}
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int culcu(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1/num2;
	}

}
