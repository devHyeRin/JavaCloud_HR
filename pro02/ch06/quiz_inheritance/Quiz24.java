package ch06.quiz_inheritance;

/**
 * 날짜 : 2025. 8. 30.
 * 작성자 : 이혜린
 * 내용 : 문제24 - 추상 클래스 선언
 */

abstract class Message{
	protected String title;
	protected String name;
	
	abstract public void send(String title, String name);
}

public class Quiz24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
