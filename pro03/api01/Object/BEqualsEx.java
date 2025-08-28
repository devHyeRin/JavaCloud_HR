package api01.Object;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : Object 클래스 >> boolean equals(Object obj)
 */
public class BEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("apple");
		String irum = new String("apple");
		
		String a = "hi";
		String b = "hi";
		
		//== 비교 -> 주소값 비교 : true, false 반환
		System.out.println("String 주소값 비교 : " + (name == irum));	//true 반환
		System.out.println("String 주소값 비교 : " + (a ==b));    //true 반환
		
		//equals() -> 데이터 값 비교 : true, false 반환
		//문자열 비교는 무조건 equals() 함수 사용!!
		System.out.println("String 데이터값 비교 : " + (name.equals(irum)));
		System.out.println("String 데이터값 비교 : " + (irum.equals(name)));
		System.out.println("String 데이터값 비교 : " + a.equals(b));
		
		/* 정수형 값 비교는 == 사용 -> 헷갈리지 말기!!
		int x =10;
		int y = 20;
		if(x == y)
		*/
	}

}
