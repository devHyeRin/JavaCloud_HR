package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 이혜린
 * @설명 : 반복문(for문)
 */
public class Exam23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println(++su);
		}
		System.out.println();

		int hap = 0; // 누적합
		for (int i = 1; i <= 10; i++) {
			hap += i;
		}
		System.out.println(hap);

		int sum = 0; // 누적합
		for (int i = 100; i <= 200; i++) {
			if (i > 150 && i < 200) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
