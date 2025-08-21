package ch03.array;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 2차원 배열
 */
public class Exam45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[] { 1, 2, 3 };
		int[] y = new int[5];

		// 복사 y=x
		// 배열로 복사하는 방법
		for (int i = 0; i < x.length; i++) {
			y[i] = x[i];
		}
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}

		System.out.println();

		// 제공함수 사용한 복사 방법
		int[] a = new int[] { 11, 22, 33, 44, 55 };
		int[] b = new int[a.length];

		// (원본, 원본시작번호, 복사본, 복사본 시작번호, 복사할 개수)
		System.arraycopy(a, 0, b, 0, a.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
