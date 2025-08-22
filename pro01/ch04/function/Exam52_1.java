package ch04.function;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 이혜린
 * @설명 : 함수 - call by value 
 */
public class Exam52_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("name: ");
		String name = sc.next();

		System.out.println("kor: ");
		int kor = sc.nextInt();

		System.out.println("eng: ");
		int eng = sc.nextInt();

		System.out.println("mat: ");
		int mat = sc.nextInt();

		System.out.println("이름: " + name);

		total(kor, eng, mat);
		average(kor, eng, mat);
		
		sc.close();
	}

	// 총점 함수
	public static void total(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		System.out.println("총점: " + tot);
	}

	// 평균 함수
	public static void average(int kor, int eng, int mat) {
		float avg = (float) (kor + eng + mat) / 3;
		System.out.println("총점: " + avg);
	}

}
