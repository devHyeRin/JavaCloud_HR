package ch03.array;

import java.util.Scanner;

public class Exam43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[2][3];

		// 배열데이터 입력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(i + "행" + j + "열" + " 수를 입력:");
				array[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// 출력 또는 연산
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();

	}

}
