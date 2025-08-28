package ch05.object;

public class Sung {
	//속성 = 멤버변수
	public String name;
	public int kor;
	public int eng;
	public int mat;
	public int tot;
	public float avg;
	//tot 변수, avg변수는 total(), average(), disp() 함수가 동일하게 필요하므로 멤버변수로 선언해서 사용
	//클래스의 필요성 : 재사용과 확장성을 위해
	
	//동작 - 함수
	public void total() {
		tot = kor + eng + mat;
	}
	
	public void average() {
		avg = (float)tot / 3;
	}
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
	
}
