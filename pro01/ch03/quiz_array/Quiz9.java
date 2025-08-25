package ch03.quiz_array;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제9 - 정수를 10개 입력 받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라 출력하는 프로그램
 */
public class Quiz9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int sum = 0;
		System.out.print("정수 10개 입력 >> ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] % 3 == 0) {
				sum += array[i];
			}
		}
		
		System.out.println("sum: " + sum);
	}

}
