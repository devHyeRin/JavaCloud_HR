package ch04.function;

/**
 * @날짜 :2025. 8. 22.
 * @작성자 : 이혜린
 * @설명 : function Overload(Overloading) 함수 오버로딩(함수 중복) : 함수의 이름은 같지만, 매개변수 타입과
 *     개수가 다름 동일한 기능인 함수의 이름 같게 해줌
 */
public class Exam57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		disp("홍길동");
		disp(10);
		disp(24.5f);
		disp('A');
		disp(55, 77);
	}

	public static void disp(String name) {
		System.out.println(name);
	}

	public static void disp(int x) {
		System.out.println(x);
	}
	
	public static void disp(float y) {
		System.out.println(y);
	}

	public static void disp(char ch) {
		System.out.println(ch);
	}
	
	public static void disp(int x, int y) {
		System.out.println(x + "\t" + y);
	}
}
