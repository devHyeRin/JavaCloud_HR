package ch06.inheritance;

import ch05.object.Saram;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 상속 - extends : 확장성, 중복제거
 *  - protected : 접근제한자 - super, super()
 *  - 함수 재정의
 *     : 상속 받아서 함수를 다 재정의 >> 자식입장 
 *  
 *  - 자식 제어(컨트롤)할 수 있다 >> 부모입장
 * 
 *     업캐스팅(Upcasting)
 * 
 */

class Shape {
	public void aa() {
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void bb() {
	}

	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void cc() {
	}

	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void dd() {
	}

	public void draw() {
		System.out.println("Circle");
	}
}

public class Exam89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		long b = a; // 자동 형변환
		byte c = (byte) a; // 명시적 형변환

		Shape s = new Shape(); // aa(), draw()
		s.draw();
		
		Line i = new Line(); // aa(), bb(), draw()
		i.draw();
		
		// 각자 다른 객체 -> 각자 따로 관리
		Shape[] ss = new Shape[3];
		Line[] ii = new Line[3];

		// 부모 Shape -> 4개의 클래스를 모두 같이 쓰는 방법 -> 같이 관리
		// 업캐스팅(Upcasting) : 자식클래스가 부모클래스 타입으로 변환하는 것

		Shape shape = new Line(); // 자식을 부모가 담아줄 수 있음(자동 형변환)
//		Line aa = new Shape();					//error -> 부모를 자식에 담을 수 없음

		shape.aa(); // 가능 -> Line() 클래스가 Shape인 부모 클래스를 상속받았기 때문에 접근할 수 있음
//		shape.bb();	 ERROR 
		shape.draw();

		Shape h = new Rect();
		h.aa();
//		h.cc();			ERROR
		h.draw();

		Shape r = new Circle();
		h.aa();
//		h.dd();			ERROR
		h.draw();

		System.out.println("---------------");
		// 업캐스팅 방법으로 자식의 클래스를 배열로 모아서 관리할 수 있음
		Shape[] array = new Shape[3];
		array[0] = new Line();
		array[1] = new Rect();
		array[2] = new Circle();

		//위의 코드를 한번에 배열로 해서 함수 호출하기
		//근데 이 코드의 문제점은 부모의 함수아니면 자식 함수에 재정의된 함수만 사용할 수 있음
		//부모의 자료형에 자식을 담았을 때 부모가 자식클래스에만 있는 함수를 호출하고 싶다면
		//인터페이스를 사용해야한다!!!
		for (int j = 0; j < array.length; j++) {
			array[j].aa();
			array[j].draw();
		}

	}

}
