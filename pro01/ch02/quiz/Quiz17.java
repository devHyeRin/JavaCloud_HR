package ch02.quiz;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char level = 'B';
		String grade = "";
		
		switch(level) {
		case 'A' : case 'a':
			grade = "우수회원";
			break;
		case 'B' : case 'b':
			grade = "정회원";
			break;
		case 'C' : case 'c':
			grade = "일반회원";
			break;
		case 'F' : case 'f':
			grade = "손님";
			break;
		default:
			System.out.println("잘못 선택");
			break;
		}
		System.out.println(grade + "입니다.");
	}

}
