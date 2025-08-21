package ch03.array;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 1차원 배열 - 배열의 누적합 계산
 */
public class Exam39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("배열수 입력:");
		int su = sc.nextInt();

		// 배열 입력
		int[] array = new int[su];

		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "번째 수 입력:");
			array[i] = sc.nextInt();
		}

		// 배열 연산 또는 출력
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum += array[i];
			}
		}
		System.out.println(sum);

		sc.close();
	}

}
