package aa;

public class BB {
	public static void main(String[] args) {
		AA a = new AA();
		
//		System.out.println(a.x);		ERROR x는 private 변수
		System.out.println(a.y);     //동일패키지 내에선 가능
		System.out.println(a.z);
		System.out.println(a.su);   //동일패키지 내에선 가능
	}
}
