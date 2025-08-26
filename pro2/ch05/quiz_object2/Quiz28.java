package ch05.quiz_object2;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 문제28 - 학점 구하는 클래스 작성
 */

class HakJum{
	private int jumsu;
	private char grade;
	
	public HakJum() {}
	
	public HakJum(int jumsu) {
		this.jumsu = jumsu;
	}
	
	public void getHakjum() {
		if(jumsu > 90 && jumsu <= 10) {
			grade = 'A';
		}else if(jumsu > 80 && jumsu <= 90) {
			grade = 'B';
		}else if(jumsu > 70 && jumsu <= 80) {
			grade = 'C';
		}else if(jumsu > 60 && jumsu <= 70) {
			grade = 'D';
		}else {
			grade = 'F';
		}
	}
	
	public void disp() {
		System.out.println("jumsu : " + jumsu + "\t grade : " + grade);
	}
}

public class Quiz28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HakJum h = new HakJum(88);
		h.getHakjum();
		h.disp();
	}

}
