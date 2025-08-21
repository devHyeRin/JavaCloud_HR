package ch03.array;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 2차원 배열
 */
public class Exam41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };

		for (int i = 0; i < 2; i++) { // 0 1
			for (int j = 0; j < 3; j++) { // 012 012
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		// 행의 수 구하기
		System.out.println("행의 수:" + array.length);

		// 열의 수 구하기
		System.out.println("0행의 열 수:" + array[0].length);
		System.out.println("1행의 열 수:" + array[1].length);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
