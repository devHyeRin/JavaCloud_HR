package api05.Math;

import java.util.Arrays;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : Math 클래스
 */
public class BRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("20의 절대값 : " + Math.abs(-20));
		System.out.println("최대값 : " + Math.max(10, 30));
		System.out.println("최소값 : " + Math.min(1.5, 1.3));
		System.out.println("2의 3승 : " + (int) Math.pow(2, 3));
		System.out.println();

		// 0 ~ 1
		System.out.println(Math.random());
		int ran = (int) (Math.random() * 10);
		System.out.println("0~9 : " + ran);

		String[] str = new String[] { "손민영", "이대훈", "박성욱", "김민희", "이혜린" };
		int idx = (int) (Math.random() * str.length);
		System.out.println("0~4 : " + str[idx]);
		System.out.println();

		int[] selectNumber = new int[6];
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = (int) (Math.random() * 45) + 1;		//1~45
//			System.out.print(selectNumber[i] + "    ");
		}
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		System.out.println();
	

	}

}
