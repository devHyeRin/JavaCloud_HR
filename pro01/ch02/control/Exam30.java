package ch02.control;

/**
 * @날짜 :2025. 8. 20.
 * @작성자 : 이혜린
 * @설명 : 제어문 - break, continue
 */
public class Exam30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <=10; i++) {
			if(i ==5) {
				break;						//if문을 제외한 가장 가까운 블럭으로 빠져나간다.
			}
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1; i<= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
