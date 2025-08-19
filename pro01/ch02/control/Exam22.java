package ch02.control;

/*
 * 제어문 - 반복문 (for, 다중 for) 
 * */

public class Exam22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i = 1 -> 초기화는 한번만
		for (int i = 1; i <= 10; i++) { // 반복
			System.out.println("How are you?");
		}
		System.out.println();

		for (int j = 10; j >= 1; j--) {
			System.out.println("java");
		}
		System.out.println();

		for (int k = 1; k <= 10; k++) {
			System.out.println(k); // 1씩 증가된 k 값이 출력됨 -> 1 ~ 10
		}
		System.out.println();

		for (int k = 1; k <= 10; k += 2) {
			System.out.println(k); // 2씩 증가된 k 값이 출력됨 -> 1,3,5,7,9
		}
		System.out.println();

		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);			//10의 배수가 출력됨
			}
		}

	}

}
