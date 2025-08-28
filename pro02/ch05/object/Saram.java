package ch05.object;

public class Saram {
	public String name;
	public String address;
	public String phoneNumber;
	private String juminBunho;
	public int age;
	
	//private로 생성된 변수는 getter, setter를 사용해야 함
	public void setJuminBunho(String j) {
		juminBunho = j;
	}
	
}
