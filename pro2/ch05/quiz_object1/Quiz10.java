package ch05.quiz_object1;

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public boolean login(String id, String password) {
		boolean check = false;
		
		if(id == "hong" && password == "1234") {
			check = true;
		}
		return check;
	}
	
	public void logout(String id) {
		System.out.println(id + "님 로그아웃 되었습니다.");
	}
}

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		boolean check = m.login("hong", "1234");
		
		if(check == true) {
			m.logout("hong");
		}
	}

}
