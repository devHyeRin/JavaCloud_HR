package ch05.object;

public class MyData {//this== myData
	private int x;			//this.x == mData
	private int y;
	
	//외부에서 데이터 입력 받아서 이 클래스가 가지고 있는
	//멤버변수에 전달하고 담아서 다시 메인에 전달하는 역할
	public void setData(int x, int y) {
		//블럭 안의 변수가 우선순위가 높음
		//해당 변수들은 매개변수의 x임
		this.x = x;
		this.y = y;
		System.out.println(x + "\t" + y);
		System.out.println(this.x + "\t" + this.y);
	}
	//실무에서는 멤버변수와 매개변수를 같은 변수로 지정하기 때문에
	//이것의 문제점은? -> 어떤 변수인지 구분이 안됨
	
	public void disp() {
		System.out.println(x + "\t" + y);		//this 생략 가능
	}
	public void aa() {
		this.disp();
	
	}
	
	
}
