package api01.Object;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 :  Object 클래스 >> String toString()
 */
public class CSmartPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSmartPhone android = new CSmartPhone("구글", "안드로이드");
		android.disp();
		System.out.println(android);  //객체 출력 
//		System.out.println(android.toString());	
		//disp()처럼 출력하고 싶다면 toString() 함수 재정의 필요
		//함수만 재정의하고 toString() 호출 안해줘도 됨!
		
		Integer a = new Integer(10);
		System.out.println(a);   //객체명 출력 시 내부적으로 toString() 호출
//		System.out.println(a.toString());
	}

}
