package ch06.inheritance;

class AParents{
	protected int x, y;
}

class ASon extends AParents{				//x, y, a, b, disp()
	private int a, b;
	
	public void input(int x, int y, int a, int b) {
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}
	
	public void disp() {
//		System.out.println(x);		//접근제한자 private 사용하면 접근할 수 없음
		System.out.println(x);
		System.out.println(this.x);  //상속받았으므로 사용할 수 있음 (문제, 부모꺼인지 알 수가 없음)
		System.out.println(super.x);    //부모변수는 super로 구분한다 (this를 써도 상관없음 - 구분해주기 위해 사용)
		System.out.println();
		
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
		
		//ASon 클래스의 멤버변수이기 때문에 super는 사용할 수 없음
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
	}
}


public class Exam82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASon b = new ASon();			// 자식 클래스
		b.input(10, 20, 30, 40);
		b.disp();
		
	}

}
