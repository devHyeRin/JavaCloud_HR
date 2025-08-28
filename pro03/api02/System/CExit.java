package api02.System;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : System 클래스 - exit()
 */
public class CExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("수입력 : ");
			int su = sc.nextInt();
			
			if(su == 5) {
				System.out.println("프로그램 종료");
				sc.close();
				System.exit(0);    //break(블록 탈출), return(함수 밖으로 탈출)
			}
		}
	}

}
