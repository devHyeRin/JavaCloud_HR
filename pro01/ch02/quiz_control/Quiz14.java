package ch02.quiz_control;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요 >>>");
		
		int num=sc.nextInt();
		int first=num/10;
		int second=num%10;
		System.out.println(first + "\t" + second);
		
		switch(first){
		case 3: case 6: case 9:
			if(second==3 || second==6 || second==9){
				System.out.println("박수 짝짝");
			}else{
				System.out.println("박수 짝");
			}
			break;
		default:
			if(second==3 || second==6 || second==9){
				System.out.println("박수짝");
			}else{
				System.out.println("박수없음");
			}	
		}
		
		sc.close();
	}

}
