package api03.String;

/**
 * @날짜 :2025. 8. 28.
 * @작성자 : 이혜린
 * @설명 : String 클래스 >> charAt(), length(), indexOf()
 */
public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "자바프로그래밍";			// 내부적으로 char[] 배열의 형태
		System.out.println("문자 추출 : " + subject.charAt(5));		//그래서 인덱스로 추출
		System.out.println("문자열 길이 : " + subject.length());
		System.out.println("문자열 위치 : " + subject.indexOf("프로그래밍"));
		
		//주민번호로 남자, 여자 분류
		String juminBunho = "123456-1234567";  // 남자, 여자 분류 : charAt() 이나 "-"기준으로 추출 가능
		
		if(juminBunho.length() == 14) {
			int location = juminBunho.indexOf('-');
//			System.out.println(location);      6
			
			if(location != -1) {			//문자가 존재할 때
				char gen = juminBunho.charAt(location + 1);
//				System.out.println(gen);      1
				
				switch(gen) {
				case '1': case '3': case '5':
					System.out.println("남");
					break;
				case '2': case '4': case '6':
					System.out.println("여");
					break;
				default:
					System.out.println("성별 없음");
				}
				
			}else {								//문자가 존재하지 않을 때
				System.out.println("문자가 존재하지 않습니다.");
			}
		}else {
			System.out.println("주민번호 길이가 맞지 않습니다.");
		}
		
	}

}
