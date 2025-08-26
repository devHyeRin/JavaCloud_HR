package ch05.quiz_object2;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : Phone 클래스 작성
 */

class Phone{
	private String name;
	private String tel;
	private Scanner sc;
	
	public Phone() {
		sc = new Scanner(System.in);
		System.out.print("이름 입력 >>> ");
		name = sc.next();
		System.out.print("전화번호 입력 >>> ");
		tel = sc.next();
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class Quiz26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone kim = new Phone();
		Phone lee = new Phone();
		System.out.println(kim.getName() + "\t" + kim.getTel());
		System.out.println(lee.getName() + "\t" + lee.getTel());
	}

}
