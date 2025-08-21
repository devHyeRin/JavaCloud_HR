package ch02.control;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 반복을 활용한 표준 입출력 자바 기본 입출력 : 키보드, 모니터(화면) 자바 파일 입출력 : 다운로드, 업로드 자바 네크워크
 *     입출력 : 소켓 입력, 소켓 출력 => 챗팅 프로그램
 */
public class Exam36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char loop = 0;

		do {
			System.out.println("단을 입력하세요: ");
			int dan = sc.nextInt();

			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
			System.out.println();
			System.out.println("또할래(y/n):");
			String str = sc.next();
			loop = str.charAt(0);

			if (loop == 'n' || loop == 'N') {
				System.out.println("종료합니다.");
				break;
			}
		} while (loop == 'y' || loop == 'Y');

		sc.close();
	}

}
