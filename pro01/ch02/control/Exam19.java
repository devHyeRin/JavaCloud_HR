package ch02.control;

/*
 * 제어문 - 조건문 (if, if~else, if~else if / 중첩 if문)
 * 				- 조건문 switch ~ case
 * */

public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su = 4;

		switch (su) { // 실수형, 관계/논리연산자 안됨
		case 1: // if(su == 1) {...}
			System.out.println("1번");
			break; // 가장 가까운 블럭 밖으로 빠져나감
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default: // case 숫자 이외의 숫자가 들어올 경우 default 실행
			System.out.println("1~5까지만 가능");
		}
		System.out.println();

		//switch ~ case 문 다양한 표현 방식 -> 코드가 길어지면 축약된 방식이 가독성이 좋긴 함
		//결국 본인이 이해하기 편한 방식으로 사용하면 됨 (이해만 하면 됨!)
		int value = 1;
		switch (value) {                    // if(value == 1 || value == 2 || value == 3) { ... }
		case 1:  case 2:  case 3:      // if(value >= 1 && value <= 3) { ... }
			System.out.println("hahaha");
			break;
		case 4:  case 5:  case 6:      // if(value >= 1 && value <= 3) { ... }
			System.out.println("hahaha");
			break;
		case 7:  case 8:  case 9:      // if(value >= 1 && value <= 3) { ... }
			System.out.println("hahaha");
			break;
		}
	}

}
