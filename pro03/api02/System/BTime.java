package api02.System;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : System 클래스 >> Time / Date 클래스
 * currentTimeMillis() >> Date, SimpleDateFormat
 */
public class BTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		System.out.println("현재시간을 초단위 : " + time);
		System.out.println("현재시간을 나노초단위로 : " + System.nanoTime());
		
		//위에 현재시간 코드를 날짜로 변환
		Date date = new Date(time);
//		System.out.println(date.toString());		toString() 쓰지 않아도 내부적으로 생략해도 동작함
		System.out.println(date);   //기본 출력 : Thu Aug 28 12:19:59 GMT+09:00 2025
		
		//날짜 포맷 형태 바꾸기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ds = sdf.format(date);
		System.out.println(ds);
		
	}

}
