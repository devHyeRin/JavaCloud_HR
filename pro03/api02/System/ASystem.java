package api02.System;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : System 클래스
 */
public class ASystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hahaha");
		PrintStream ps = System.out;		//System.out 반환형은 PrintStream 클래스
		ps.println("API 시작합니다.");        //println() 함수 -> 오버로딩으로 함수 중복 정의됨
		ps.println(10);
		ps.println(24.5f);
		
		InputStream is = System.in;
		
		//바이트 방식, 문자 방식
		System.out.println("문자입력");
		char value =  (char) is.read();			//1.(1)A 입력 // 2.(1)문자로 출력되기 하려면 char로 형변환 필요
		is.read();	// \r
		is.read();	// \n
		
		System.out.println("문자입력");
		char imsi =  (char) is.read();	
		is.read();	// \r
		is.read();	// \n
		
		System.out.println("문자입력");
		char temp =  (char) is.read();	
		is.read();	// \r
		is.read();	// \n
		
		System.out.println(value);		//1.(2)65 출력 (원래 반환형이 byte라서) // 2.(2)A로 출력
		System.out.println(imsi);
		System.out.println(temp);
		
		System.out.println();
		
		Scanner sc = new Scanner(is);				//new Scanner(InputStream is)
		
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		System.out.println(str);
		
		System.out.println("문자 입력 : ");
		String strCh = sc.next();
		char ch = strCh.charAt(0);		//바이트 방식처럼 활용 >> 문자열 읽어온다
		System.out.println(ch);
		
		sc.close();
		
	}

}
