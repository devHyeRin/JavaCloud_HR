package ch04.function;

/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 이혜린
 * @설명 : 함수 - 배열
 */

import java.util.Scanner;

public class Exam56 {

	public static void main(String[] args) { // 10 20 30 40 50
		// TODO Auto-generated method stub
//		Scanner sc = null;
//
//		for (int i = 0; i < args.length; i++) {
//			sc = new Scanner(args[i]);				//문자열로 읽어와서
//			int value = sc.nextInt();					//정수형으로 바꾸기
//			System.out.println(++value);
//		}
//
//		sc.close();

		//정수형으로 바꿔주는 Integer.parseInt()을 사용하는 방법
		//훨씬 더 많이 사용하는 방법 - 웹에서 많이 사용
		int hap = 0;
		for (int i = 0; i < args.length; i++) {
			int x = Integer.parseInt(args[i]);
			hap += x;
		}
		System.out.println(hap);
	}

}
