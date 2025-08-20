package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 이혜린
 * @설명 : 제어문 - 다중 for (구구단 작성)
 */
public class Exam26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//열단위 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j) + "\t\t");
			}
			System.out.println();
		}
		
		//행단위 출력
		System.out.println("\t\t\t\t 구구단");
		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단" + "\t\t\t");
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t\t");
			}
			System.out.println();
		}
	}

}
