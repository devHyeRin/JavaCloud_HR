package ch05.quiz_object2;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제27 - 정사각형을 표현하는 Rect 클래스 작성 
 * -> Rect 객체 배열 생성, 사용자로부터 4개의 사각형을 main에서 입력받아 배열에 저장하고, 정사각형의 넓이 구하기
 */

class Rect{
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
}

public class Quiz27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rect[] rect = new Rect[4];
		
		for(int i = 0; i < rect.length; i++) {
			System.out.print("너비와 높이 >> ");
			int width = sc.nextInt();
			int height = sc.nextInt();
			rect[i] = new Rect(width, height);
		}
		
		for(int i = 0; i < rect.length; i++) {
			System.out.println((i + 1) + "번째 정사각형의 넓이는 " + rect[i].getArea() + "입니다.");
		}
		
		sc.close();
	}

}
