package api03.String;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : 문자열 클래스
 * >>String
 * >>StringBuffer
 * >>StringBuilder
 */
public class StringBuffer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "새천년";
		String s2 = "대한민국";
		String s3 = s1;
		System.out.println("s1 hash code : " + s1.hashCode());    //메모리 할당받은 주소값 출력
		System.out.println("s2 hash code : " + s2.hashCode());    
		System.out.println("s3 hash code : " + s3.hashCode());    
		
		s1 += s2;
		System.out.println(s1);
		System.out.println("s1 hash code : " + s1.hashCode());   //문자열이 추가돼서 주소값이 달라짐
		
		s1 += "좋은나라";
		System.out.println(s1);
		System.out.println("s1 hash code : " + s1.hashCode());   
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("우리나라");
		StringBuffer sb2 = new StringBuffer("대한민국");
		System.out.println("sb1 hash code : " + sb1.hashCode());
		System.out.println("sb2 hash code : " + sb2.hashCode());
		
		//문자열 추가
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println("sb1 hash code : " + sb1.hashCode());   //sb1 객체의 주소값
		
		StringBuffer str = new StringBuffer("apple");
		System.out.println("문자열 길이 : " + str.length());
		System.out.println("문자열 용량(byte)" + str.capacity());  //문자열 길이 5 + 기본버퍼 16 =21
		System.out.println();
		
	str.append("우리나라우리나라우리나라우리나라");
	System.out.println(str);
	System.out.println("문자열 길이 : " + str.length());
	System.out.println("문자열 용량(byte)" + str.capacity()); 
		
		
		
		
	}

}
