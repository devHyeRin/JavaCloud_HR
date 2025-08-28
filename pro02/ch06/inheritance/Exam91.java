package ch06.inheritance;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 함수 재정의 >> 추상클래스, 추상함수 >> interface 
 */

abstract class IParents{		//추상클래스는 추상함수를 하나라도 가지고 있을 경우 정의 
	protected int x, y;
	
	public void msg() {
		System.out.println("어서 가을이 와라~~~");
	}
	
	public abstract void disp();			//추상함수
			
}

class ISon extends IParents{		//x, y, msg(), disp()

	@Override
	public void disp() {
		System.out.println("Son disp");
	}
	
}

class IDaughter extends IParents{		//x, y, msg(), disp()

	@Override
	public void disp() {
		System.out.println("Daughter disp");
	}
	
}

public class Exam91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IParents a = new IParents();		ERROR  추상클래스는 자신의 객체를 못 만든다
		
		ISon s = new ISon();
		s.disp();
		
		IDaughter d = new IDaughter();
		d.disp();
		
		System.out.println();
		
		//자기 자신은 못만들지만 자식의 클래스를 담을 수 있음
		IParents x = new ISon();
		x.disp();
		
		IParents y = new IDaughter();
		y.disp();
	}

}
