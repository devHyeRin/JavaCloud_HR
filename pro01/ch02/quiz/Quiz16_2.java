package ch02.quiz;

public class Quiz16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		//for문을 이용한 합계
		for(int i = 10; i <= 20; i++) {
			sum1 += i;
		}
		System.out.println("for문 sum1 : " + sum1);
		
		//while문을 이용한 합계
		int i = 10;
		while(i <= 20) {
			sum2 += i;
			i++;
		}
		System.out.println("while문 sum2 : " + sum2);
		
		//do~while문을 이용한 합계
		int j = 10;
		
		do {
			sum3 += j;
			j++;
		}while(j <= 20);
		
		System.out.println("do~while문 sum3 : " + sum3);
	}

}
