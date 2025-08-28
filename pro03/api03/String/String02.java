package api03.String;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : String 클래스 >> equals(), equalsIgnoreCase(), toLower(), toUpperCase()
 */
public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "apple";
		String b = "apple";
		System.out.println("주소값 비교 : " + (a == b));    //true 
		System.out.println("데이터값 비교 : " + a.equals(b));    //true
		
		String x = new String("hi");
		String y = new String("hi");
		System.out.println("주소값 비교 : " + (x == y));   //false
		System.out.println("데이터값 비교 : " + x.equals(y));   //true
		System.out.println();
		
		String s = "banana";
		String t = "BANANA";
		System.out.println("데이터값 비교 (대소문자 구분) : " + s.equals(t));     //false
		System.out.println("데이터값 비교 (대소문자 구분안함) : " + s.equalsIgnoreCase(t));    //true
		
		System.out.println("대문자로 : " + t.toUpperCase());
		System.out.println("소문자로 : " + s.toLowerCase());
 	}

}
