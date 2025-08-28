package ch05.object;

public class Pay {
	public String name;
	public int bonbong;	//왕눈이
	public int tex;			//2000000
	public int silsu;
	
	//입력함수
	public void input(String name, int bonbong) {
		this.name = name;			//this.name은 멤버변수 name
		this.bonbong = bonbong;		//this 생략 불가능
	}
	
	//연산함수
	public void yonsan() {
		tex = (int)(bonbong * 0.045 + 0.5);
		silsu = bonbong - tex;
	}
	
	//출력함수
	public void output() {
		System.out.println("name: " + name);		//여기서는 this 생략 가능
		System.out.println("bonbong: " + bonbong);
		System.out.println("tex: " + tex);
		System.out.println("silsu: " + this.silsu + "\n");
	}
}

//a.name, a.bonbong, a.tex, a.silsu
//a.input()
