package ch06.inheritance;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 상속 - static 변수, 함수 / final 변수, 함수
 */

class HParents{
	protected static int x = 10;
	protected static final int Y = 20;
	
	public static void aa() {}
	
	public static final void bb() {}		//재정의 불가능
	public final void cc() {}					//재정의 불가능
	
}

class HSon extends HParents{				//x, Y
	public static int su = 77;
	public static final int VALUE = 88;

	public void xx() {
		super.cc();
	}
	
//	public void cc() {}		//부모클래스에서 final로 함수를 정의했기 때문에 재정의 불가능
										//final은 값을 변경할 수 없기 때문에
	
	//접근제한자 지정예약어 반환형 함수명(매개변수 목록) {}
	//접근 제한자 : public, protected, private
	//지정예약어 : 없다, static, final, static final, abstract
	//반환형 : 정수형, 실수형, 문자형, 문자열형, 배열, 클래스
}

public class Exam93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = HParents.x;
		System.out.println(HParents.x);
		System.out.println(HSon.x);
		System.out.println();
		
		System.out.println(HParents.Y);
		System.out.println(HSon.Y);
		System.out.println();
		
		System.out.println(HSon.su);
		System.out.println(HSon.VALUE);
		System.out.println();
		
		HParents.aa();
		HSon.aa();
		
		HSon.bb();		//bb() 함수는 static 함수이기 때문에 클래스명으로 접근
		HSon h = new HSon();
		h.cc();		
	}

}
