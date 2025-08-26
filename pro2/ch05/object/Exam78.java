package ch05.object;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : static 변수, static 함수
 */

class TestG {
	public String name;
	public int don;
	public static float iyul; // this를 사용할 수 없음

	public static void setIyul(float iyul) {		//static 함수도 객체로 접근할 수 없음 -> 클래스명으로 접근해야함
		TestG.iyul = iyul;			//static 변수는 this가 아니고 클래스명으로 접근해야함
		System.out.println(TestG.iyul);
		
//		System.out.println(name);         //name -> error : 밑에 disp() 함수에서는 name이 에러는 안남
		//static 함수는 static 변수만 가져다 쓸 수 있음! -> name은 static 변수가 아니기 때문에
		
//		aa();     //error : 이것 또한 static 함수만 쓸 수 있음
	}
	
	public TestG() {
	}

	public TestG(String name, int don, float iyul) {
		this.name = name;
		this.don = don;
		TestG.iyul = iyul;
	}

	public void disp() {
		System.out.println(name);
		System.out.println(don);
		System.out.println(iyul);

		aa();
	}
	
	public void aa() {}

}

public class Exam78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stack / heap 영역
		TestG a = new TestG("kim", 10000, 0.07f);
		a.disp();
		
		a.name="홍길동";
		a.don = 20000;
		TestG.iyul = 22.5f;
		
		//자바 api 사용하기 - Math 클래스
		double x = Math.PI;					//Math 클래스에 있는 PI 변수 사용하기
		System.out.println(x);
		
		double y = Math.abs(-22.5);		//Math 클래스에 있는 abs() 함수 사용하기
		System.out.println(y);
		
		//자바 api 사용하기 - String 클래스
		String str = new String("apple");
		byte[] b = str.getBytes();
	}

}
