package api05.Math;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : Math 클래서 - 반올림, 내림, 올림
 */
public class ARoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 123.5672;
		double y = 456.4672;
		
		long a = Math.round(x);
		System.out.println("반올림 : " + a);     // 124
		
		int b = (int)Math.ceil(y);
		System.out.println("무조건 올림 : " + b);    //457
		
		int c = (int)Math.floor(x);
		System.out.println("무조건 내림 : " + c);     //123
		
		//소수 둘째 자리에서 반올림 첫째 출력    123.6
		double o = Math.round(x * 10) / 10.0;
		System.out.println("둘째자리 반올림, 첫째자리 출력 : " + o);
		
		double i = Math.round(x * 100) / 100.0;
		System.out.println("세자리 반올림, 둘째자리 출력 : " + i);
		
		double j = Math.round(x * 1000) / 1000.0;
		System.out.println("네자리 반올림, 셋째자리 출력 : " + j);
	}

}
