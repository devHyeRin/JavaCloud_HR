package api06.Date;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : DecimalFormat 클래스
 */
public class DecimalEx {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		double x = 1234567.89;
		
		DecimalFormat d1 = new DecimalFormat("0000000.00");
		DecimalFormat d2 = new DecimalFormat("0.00");
		DecimalFormat d3 = new DecimalFormat("0");
		DecimalFormat d4 = new DecimalFormat("0.0000");   	// 남은 소수점 자리 0으로 채워짐
		DecimalFormat d5 = new DecimalFormat("000000000000.00");   	// 남은 소수점 자리 0으로 채워짐
		
		System.out.println(d1.format(x));
		System.out.println(d2.format(x));
		System.out.println(d3.format(x));
		System.out.println(d4.format(x));
		
		System.out.println();
		DecimalFormat d6 = new DecimalFormat("#######.##");   	// 남은 소수점 자리 0으로 채워짐
		DecimalFormat d7 = new DecimalFormat("#.##");
		DecimalFormat d8 = new DecimalFormat("#");
		DecimalFormat d9 = new DecimalFormat("#.####");
		DecimalFormat d10 = new DecimalFormat("##########.#");   	// 남은 소수점 자리 0으로 채워짐
		
		System.out.println(d6.format(x));
		System.out.println(d7.format(x));
		System.out.println(d8.format(x));
		System.out.println(d9.format(x));
		System.out.println(d10.format(x));
		
		System.out.println();
		int y = 123456789;
		DecimalFormat d11 = new DecimalFormat("#,###");
		DecimalFormat d12 = new DecimalFormat("#,####");
		DecimalFormat d13 = new DecimalFormat("#,#####");
		DecimalFormat d14 = new DecimalFormat("\u00A4 #,###");
				
		System.out.println(d11.format(y));
		System.out.println(d12.format(y));
		System.out.println(d13.format(y));
		System.out.println(d14.format(y));
		
		//문자열 -> 정수형 변환
		String str = "123,456,789";
		DecimalFormat df = new DecimalFormat("#,###");
		Number num = df.parse(str);
		int su = num.intValue();
		System.out.println(su);
		
		
	}

}
