package ch04.function;

public class Exam53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = sub1();
		System.out.println(x);
		
		float y = sub2();
		System.out.println(y);
		
		String z = sub3();
		System.out.println(z);
		
		int hap = sub4(5 ,6);
		System.out.println(hap);
	}
	
	public static int sub1() {
		int x = 10;
		++x;
		return x;
	}
	
	public static float sub2() {
		return 24.4f;
	}
	
	public static String sub3() {
		return "apple";
	}
	
	public static int sub4(int a, int b) {
		return a + b;
	}

}
