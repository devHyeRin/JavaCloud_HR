package ch01.dataType;

/*
 * 7. 삼항 연산자 : 조건식 ? 참 : 거짓
 * 8. 대입 연산자
 * 9. 후의형 증감 연산자
 * 10. 순차(컴마) 연산자
 * 
 * */

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;

		System.out.println(a == 10 ? "True" : "False"); // True 출력

		int b = 20;
		int c = 30;
		int d = b != c ? b : c;

		System.out.println(d); // 20
		System.out.println();

		int i = 100;
		System.out.println(i += 2); // i = i + 2
		System.out.println(i -= 2);
		System.out.println(i *= 2);
		System.out.println(i /= 2);
		System.out.println(i); // i의 최종값
		System.out.println();

		// 순차 연산자 사용 권장x , 하나씩 선언 추천
		/*
		 * int x = 10; 
		 * int y = 20; 
		 * int z = 30;
		 */
		int x = 10, y = 20, z = 30;
		System.out.println(x + "\t" + y + "\t" + z);
		System.out.println("--------------------------------------\n");

		int su = 10;
		int value = 20;
		System.out.println(su);
		System.out.println("su : " + su); // 문자열 + 정수형 -> 문자열
		System.out.println("su: " + su + "\t value : " + value); // 문자열 + 정수형 + 문자열 + 정수형 -> 문자열
		System.out.println(su + value); // 정수형
		// 10 20 이 출력되도록 하려면 어떻게 해야할까?
		// System.out.println(su + " " + value);
		// 사이에 빈 문자열 넣기
		System.out.println("결과: " + su + value); // 결과: 1020
		// 1020 으로 출력된 부분을 연산하려면? -> 연산자 우선순위로 해결
		System.out.println("결과: " + (su + value));
	}

}
