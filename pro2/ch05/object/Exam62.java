package ch05.object;

public class Exam62 {
	public static void main(String[] args) {
		Su a = new Su();			//객체
		a.x = 10;
		a.y = 20;
		System.out.println(a.x + "\t" + a.y);
		
		Su b = new Su();
		b.x = 77;
		b.y = 88;
		System.out.println(b.x + "\t" + b.y);
		
		Su c = new Su();
		c.x = 1;
		c.y = 2;
		System.out.println(c.x + "\t" + c.y);
		
		
	}
}
