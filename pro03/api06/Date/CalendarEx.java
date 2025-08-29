package api06.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : java.util >> Calendar 클래스
 */
public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day = today.get(Calendar.DAY_OF_MONTH);
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int seconde = today.get(Calendar.SECOND);
		
		int amPm = today.get(Calendar.AM_PM);
		
		System.out.print(year + "년도 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일\t");
		
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(seconde + "초 ");
		System.out.print(amPm == 0 ? "오전" : "오후");
		System.out.println();
		
		
		//Calendar 현재 시스템 날짜 가져와서 원하는 포맷 출력 방식
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
		//Date 현재 시스템 날짜를 가져와서 원하는 포맷 출력 방식
		Date d = new Date();
		sdf.format(d);
	}

}
