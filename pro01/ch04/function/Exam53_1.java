package ch04.function;

import java.util.Scanner;

public class Exam53_1 {

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


		int tot = total(kor, eng, mat);
		float avg = average(kor, eng, mat);
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		sc.close();
	}

	// 총점 함수
	public static int total(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		return tot;
	}

	// 평균 함수
	public static float average(int kor, int eng, int mat) {
		float avg = (float) (kor + eng + mat) / 3;
		return avg;
	}

}
