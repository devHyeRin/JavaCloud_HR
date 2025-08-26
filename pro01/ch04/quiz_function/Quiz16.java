package ch04.quiz_function;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제16 - login() 함수와 logout()함수 선언, login 함수 호출 시 매개값 id와 password 제공
 * logout() 함수는 id만 매개값으로 제공
 */
public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = login("hong", "1234");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			logout("hong");
		}else{
			System.out.println("id와 password가 올바르지 않습니다.");
		}
	}
	
	public static boolean login(String id, String password) {
		boolean check = false;
		if(id == "hong" && password == "1234") {
			check = true;			// 이부분에 리턴값을 적으면 안되는 이유는 블럭 단위이기 때문에 if문 밖에 선언해야함?!
		}
		return check;
	}
	
	public static void logout(String id) {
		System.out.println(id + "님 로그아웃 되었습니다.");
	}

}
