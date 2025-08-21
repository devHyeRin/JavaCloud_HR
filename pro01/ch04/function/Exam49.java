package ch04.function;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 함수 - call by value
 */
public class Exam49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 함수호출할 때 매개변수와 함수 선언 매개변수 개수가 동일해야함
		// 함수 선언 시 매개변수 자료형과 호출 시 매개변수 자료형이 동일해야함
		sub1(10);
		sub2(10, 20);
		System.out.println("good");
		sub2(5, 7);
		System.out.println("end");

	}

	public static void sub1(int x) {
		System.out.println(x); // x=10
	}

	public static void sub2(int a, int b) { // a=10  5,  b=20  7
		System.out.println("a:" + a); // 10  5

		for (int i = 0; i < b; i++) { // b=20  7
			System.out.println("hahahaha"); // 20개 출력

		}
	}

}
