package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 이혜린
 * @설명 : 제어문 - 반복문(while, do~while 차이점)		
 */
public class Exam29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
	
       while(x>50) {		//실행이 안된다
			System.out.println("while x :" + x);
		}
		
		do {			//일단은 실행이 된다.
			System.out.println("do x :" + x);
		}
		while(x> 50);
	}

}
