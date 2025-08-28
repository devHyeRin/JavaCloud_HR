package ch05.quiz_object2;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제24 - 클래스 작성하기
 */

class Test{
	public int a;
	public char ch;
	
	public Test(int a) {
		this.a = a;
	}
	
	public Test(char ch) {
		this.ch = ch;
	}
}

public class Quiz24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(10);
		Test e = new Test('A');
	}

}
