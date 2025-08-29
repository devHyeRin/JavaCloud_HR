package api04.Wrapper;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : Integer 클래스
 */
public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer클래스 >> 정수자료형 크기 범위, 바이트, 비트 수
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int byteSu = Integer.BYTES;
		int size = Integer.SIZE;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("byteSu : " + byteSu + "byte");
		System.out.println("size : " + size + "bit");
		
		String binary =  Integer.toBinaryString(10);
		String octal =  Integer.toOctalString(10);
		String hex =  Integer.toHexString(10);
		
		System.out.println("binary : " + binary);
		System.out.println("octal : " + octal);
		System.out.println("hex : " + hex);
		
		//문자 >> 정수형, 실수형, 논리형
		int value2 = Integer.parseInt("10");		//Integer.valueOf("10")
		double value3 = Double.parseDouble("3.14");
		boolean value4 = Boolean.parseBoolean("true");
		
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//정수형, 실수형, 논리형 >> 문자
		String value5 = String.valueOf(10);
		System.out.println(value5);
	}

}
