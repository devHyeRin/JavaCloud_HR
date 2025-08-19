package ch02.control;

public class Exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 if문
		int num = 150;
		
		if(num > 0) {
			if(num > 200) {
				System.out.println("양수이면서 200보다 큰 수입니다.");
			}else {
				System.out.println("양수이면서 200보다 작은 수 입니다.");
			}
		}else {
			System.out.println("음수입니다.");
		}
	}

}
