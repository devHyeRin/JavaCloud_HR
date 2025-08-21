package ch04.function;

/**
 * @날짜 :2025. 8. 21.
 * @작성자 : 이혜린
 * @설명 : 함수 - Call by Name
 */
public class Exam47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++) {
			sub();
		}
		System.out.println("end!!");
	}

	public static void sub() {
		System.out.println("졸려요~~~~~");
	}

}
