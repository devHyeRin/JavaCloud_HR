package ch04.function;

/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 이혜린
 * @설명 : call by value
 * 중복성을 없애고, 가독성이 좋아야 한다.
 */
public class Exam50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub(2, 5);
		System.out.println("hahaha");
		System.out.println();

		sub(3, 3);
		System.out.println("hohoho");
		System.out.println();
		
		sub(2, 10);
		System.out.println("end");
	}

	public static void sub(int x, int y) { // x : 2, y : 5   // x : 3, y : 3
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
