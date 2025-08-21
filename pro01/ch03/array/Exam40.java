package ch03.array;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 1차원 배열 - 배열의 최대값, 최소값 / 배열의 다양한 선언방법
 */
public class Exam40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 배열 입력
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + "번째 수 입력");
			array[i] = sc.nextInt();
		}

		// 최대값
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값 :" + max);

		sc.close();

		// 최소값
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];

			}
		}
		System.out.println("최소값:" + min);

		// 배열 선언 방법
		char[] a = new char[] { 'A', 'B', 'C' };
		char[] b = new char[3];

		char[] x = new char[] { 'A', 'B', 'C' };
		char y[] = new char[] { 'A', 'B', 'C' };
		
		char[] i;
		i = new char[] {'A','B'};
		
		char j[];
		j = new char[] {'A','B'};
		
		char[] k = null;
		k = new char[] {'A','B'};
		
		sc.close();
		
	}

}
