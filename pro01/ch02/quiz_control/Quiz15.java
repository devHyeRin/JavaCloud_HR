package ch02.quiz_control;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check = true;
		
		while(check) {
			Scanner sc = new Scanner(System.in);
			System.out.print("수를 입력하세요:");
			int num1 = sc.nextInt();
			System.out.print("부호를 입력하세요(+, -, *, /):");
			String cal = sc.next();
			char ch = cal.charAt(0);
			System.out.print("수를 입력하세요:");
			int num2 = sc.nextInt();
			
			int result = 0;
			
			switch(ch) {
			case '+':
				result = num1 + num2;
				check = false;
				break;
			case '-':
				result = num1 - num2;
				check = false;
				break;
			case '*':
				result = num1 * num2;
				check = false;
				break;
			case '/':
				result = num1 / num2;
				check = false;
				break;
			default:
				check = true;
				break;
			}
			System.out.println(num1 + cal + num2 + "=" + result );
		}
		
		
		
	}

}
