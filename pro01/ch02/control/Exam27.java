package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 이혜린
 * @설명 : 제어문 - 반복문 (while문) / DB 연동 후 많이 사용
 */
public class Exam27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 초기화, 조건값, 증감값
		int x = 1; 			// 초기값
		while (x <= 10) { // 조건값
			System.out.print(x + "\t");
			++x; 				// 증감값
		}
		System.out.println();

		int sum = 0; 	// 누적값 초기화
		int y = 1; 		// 초기화
		while(y<=100) {
			sum += y;
			++y;
		}
		System.out.println(sum);
		
		//다중 while
		int i = 1;
		while(i <= 5) {		//for(int i =1; i <= 5; i++) {for(int j = 1; j <= 3; j++) {.....}}
			int j = 1;
			while(j <= 3) {
				System.out.print(i+ "," + j + "\t");
				++j;
			}
			++i;
			System.out.println();
		}
	}

}
