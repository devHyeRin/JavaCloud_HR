package ch03.array;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 다차원 배열
 */
public class Exam44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("수입력:");
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
