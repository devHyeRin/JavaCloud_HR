package ch06.quiz_inheritance;

/**
 * 날짜 : 2025. 8. 30.
 * 작성자 : 이혜린
 * 내용 : 문제31 - 다이어그램, 메인화면, 결과화면 참조해서 프로그램 작성
 */

abstract class Person{
	protected String name;
	protected int kor;
	protected int eng;
	protected int math;
	protected int tot;
	protected float avg;
	
	public void setData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

class Sungjuk extends Person{
	
	public void total() {
		super.tot = super.kor + super.eng + super.math;
	}
	
	public void average() {
		super.avg = (float)super.tot / 3;
	}
	
	public void disp() {
		System.out.println(super.name + "\t" + super.kor + "\t" + super.eng + "\t" + super.math + "\t" + super.tot + "\t" + super.avg);
	}
}

public class Quiz31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sungjuk s = new Sungjuk();
		s.setData("홍길동", 100, 70, 80);
		s.total();
		s.average();
		s.disp();
	}

}
