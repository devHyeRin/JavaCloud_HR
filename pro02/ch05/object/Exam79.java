package ch05.object;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : static 변수, static 함수
 */

class TestH{
	public int x;
	public static int y;
	
	public void aa() {}
	public static void bb() {}
	
	public void disp() {
		System.out.println(x);
		System.out.println(y);
		
		aa();
		bb();
		
	}
	
	//static 함수
	public static void print() {	
//		System.out.println(x); error -> a는 static 변수가 아님
		System.out.println(y);			// y는 static 변수임
	
//		aa(); error -> aa() 함수는 static 함수가 아님
		bb();				//bb()는 static 함수임
	}
}

public class Exam79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestH a = new TestH();
		a.x = 10;
		TestH.y = 20;		//y 변수는 static 변수이므로 클래스명으로 접근해야함
		
		a.disp();
		TestH.print();		//print() 함수는 static 함수이므로 클래스명으로 접근해야함
		
//		aa();		error -> main에서 호출x
		
		final int VALUE = 20;			//값이 바뀌면 안되는 변수를 final 상수로 선언
//		VALUE = 55; 	값을 변경할 수 없음
	}
	
	// 함수를 만들 수 는 있지만 main 함수가 static으로 지정되어있기 때문에 
	//aa() 함수를 main에서 호출할 수 없음
	public void aa() {}			

}
