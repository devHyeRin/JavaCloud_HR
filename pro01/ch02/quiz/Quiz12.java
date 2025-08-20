package ch02.quiz;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = 0;
		
		for(float i = 0.01F; i <= 1; i+=0.01) {
			sum += i;
		}
		System.out.println("sum:" + sum);
	}

}
