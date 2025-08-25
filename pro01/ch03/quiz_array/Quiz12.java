package ch03.quiz_array;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		
		for(int i = 0; i < number.length; i++) {
			System.out.print("수 입력 : ");
			number[i] = sc.nextInt();
		}
		
		for(int i=0; i < number.length; i++) {
			for(int j = i+1; j < number.length; j++) {
				if(number[i] < number[j]) {
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
		}
		
		sc.close();
	}

}
