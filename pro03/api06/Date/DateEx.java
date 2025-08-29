package api06.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : SimpleDateFormat 클래스 : 날짜 형식 포맷
 */
public class DateEx {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();			//현재 날짜 시간(초) 출력
		System.out.println(time);
		
		Date date = new Date();
		System.out.println(date);    //현재 시스템 날짜를 가져온다 -> 포맷으로 형태 바꾸면 됨
		
		System.out.print(date.getYear() + "년도");
		System.out.print(date.getMonth() + 1 + "월");
		System.out.print(date.getDate() + "일");
		System.out.print(date.getHours() + "시");
		System.out.print(date.getMinutes() + "분");
		System.out.print(date.getSeconds() + "초");
		System.out.println("\n");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일 a");   //25년 08월 29일 금요일 오후
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf4.format(date));
		
		//문자 >> 날짜
		String str = "1990-12-25";   //View
		Date strDate = sdf1.parse(str);
		System.out.println(sdf1.format(strDate));
		
		//날짜 >> 문자
		String b = strDate.toString();
		

	}

}
