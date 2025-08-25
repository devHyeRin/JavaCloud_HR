package ch05.object;

import java.util.Scanner;

public class Hakjum {
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public float avg;
	// tot 변수, avg변수는 total(), average(), disp() 함수가 동일하게 필요하므로 멤버변수로 선언해서 사용
	// 클래스의 필요성 : 재사용과 확장성을 위해

	// 동작 - 함수
	//입력 함수
	public void input() {
		Scanner sc = new Scanner(System.in);

		// 변수 - 데이터 전달
		System.out.println("이름: ");
		name = sc.next();

		System.out.println("국어: ");
		kor = sc.nextInt();

		System.out.println("영어: ");
		eng = sc.nextInt();

		System.out.println("수학: ");
		mat = sc.nextInt();
		
//		sc.close(); 추후 함수로 만든다.
	}
	
	//연산 함수
	public void total() {
		tot = kor + eng + mat;
	}

	public void average() {
		avg = (float) tot / 3;
	}

	//출력 함수
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
