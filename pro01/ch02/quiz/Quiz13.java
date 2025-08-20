package ch02.quiz;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			
			if(sum >=500) {
				break;
			}
		}
		System.out.println("sum : " + sum);
	}

}
