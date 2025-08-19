package ch02.control;

/*
 * 제어문 - 조건문 (if, if~else, if~else if / 중첩 if문)
 * 				- 조건문 switch ~ case
 * */
public class Exam20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "홍길동";
		String grade = "BB";
		String numberLevel = "";
		
		switch(grade) {
		case "AA":  case "aa":
			numberLevel = "정회원";
			break;
		case "BB":  case "bb":
			numberLevel = "준회원";
			break;
		case "CC":  case "cc":
			numberLevel = "손님";
			break;
		}
		System.out.println(name + "회원님은 " + numberLevel + "입니다.");

	}

}
