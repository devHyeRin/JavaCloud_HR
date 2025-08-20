package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 이혜린
 * @설명 : 제어문 - break, continue
 */
public class Exam32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		while(x <= 10) {
			++x;
			if(x ==5) {
				//break;
				continue;
			}
			System.out.println(x);
		}
		System.out.println();
		
		int y = 1;			//초기값

		do {
			System.out.print(y + "\t");
			++y;			//증감값
		} while (y <= 10);			//조건값

		System.out.println();
	}

}
