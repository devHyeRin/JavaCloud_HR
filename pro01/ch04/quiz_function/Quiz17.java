package ch04.quiz_function;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제17 - 결과화면에 따라 프로그램 작성
 */
public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[] {"kim", "park", "lee"};
		sub(str);
	}
	
	public static void sub(String[] str) {
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
	}

}
