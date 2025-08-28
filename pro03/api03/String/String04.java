package api03.String;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : String 클래스
 */
public class String04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "홍길동,이수홍,박연수,김자바,최명호";
		String[] strArr = str.split(","); // split() 반환값 : 배열

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		System.out.println();

		// View JavaScript >> Java >> DB
		String[] a = new String[] { "홍길동", "이수홍", "박연수", "김자바", "최명호" };
		String ab = "";
		for (int i = 0; i < a.length; i++) {
			ab += a[i] + ",";
		}
		System.out.print(ab);
		System.out.println();
		System.out.println();

		// 여러개의 문자열 제거
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] textArr = text.split("&|,|-");
		for (int i = 0; i < textArr.length; i++) {
			System.out.println(textArr[i]);
		}
	}

}
