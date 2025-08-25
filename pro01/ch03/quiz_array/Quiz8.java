package ch03.quiz_array;

/**
 * @날짜 :2025. 8. 25.
 * @작성자 : 이혜린
 * @설명 : 문제8-1. while문으로 바꿔서 작성
 * 문제8-2. do~ whild문으로 바꿔서 작성
 */
public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		double array[] = { 1.0, 2.3, 3.4, 5.5 };
		
		//8번 - 3
		int i = 0;
//		while(i < array.length) {
//			sum += array[i];
//			i++;
//		}
//		System.out.println("sum: " +sum);
		
		//8번 - 4
		do {
			sum += array[i];
			i++;
		}while(i < array.length);
		
		System.out.println("sum: " +sum);
	}

}
