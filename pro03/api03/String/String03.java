package api03.String;

import java.util.Scanner;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : String 클래스
 */
public class String03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "자바는 객체지향 언어입니다.";
		String newStr = oldStr.replace("자바", "JAVA");			// 문자열을 치환해서 새로운 공간에 담음
		System.out.println("문자열 치환 : " + newStr);
		System.out.println("문자열 원본 : " + oldStr + "\n");
		
		String str = "How are you?";
		System.out.println("문자열 잘라내기 : " + str.substring(2));
		System.out.println("문자열 잘라내기 : " + str.substring(2, 9) + "\n");	//index 2 ~ 9 전까지 (2~8)
		
		
		String t = "    자바      프로그래밍    ";
		System.out.println("앞뒤공백문자제거 : " + t.trim());
		
		//문자열 >> 기본자료형(int, float ....)
		String su = "10";      //view
		Scanner sc = new Scanner(su);    // System.in
		int num = sc.nextInt();
		System.out.println(++num);
		
		//엄청 많이 사용!!!
		int value = Integer.parseInt(su);
		System.out.println(++value);
		
		sc.close();
		
		System.out.println();
		
		//기본자료형(int, float ...) >> 문자열    1980-09-09
		int imsi = 10;
		String a = String.valueOf(imsi);
		String b = String.valueOf(10.5);
		String c = String.valueOf(true);
		System.out.println(a + "\t" + b + "\t" + c);
		
	}

}
