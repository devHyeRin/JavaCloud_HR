package ch03.quiz_array;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int inwon = sc.nextInt();
		
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] mat = new int[inwon];
		int[] eng = new int[inwon];
		int[] tot = new int[inwon];
		double[] avg = new double[inwon];
		
		for(int i = 0; i < inwon; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();
			
			System.out.print("국어 : ");
			kor[i] = sc.nextInt();
			
			System.out.print("수학 : ");
			mat[i] = sc.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = sc.nextInt();
			System.out.println();
			
		}
		
		for(int i = 0; i < inwon; i++) {
			tot[i] = kor[i] + mat[i] + eng[i];
			avg[i] = (float)tot[i]/inwon;
		}
		
		System.out.println("이름\t\t" + "국어\t\t" +"영어\t\t" + "수학\t\t" +"총점\t\t" + "평균\t\t");
		for(int i = 0; i < inwon; i++) {
			System.out.println(name[i] + "\t\t" + kor[i] + "\t\t" + eng[i] + "\t\t" + mat[i] + "\t\t" + tot[i] + "\t\t" + avg[i]);
		}
		
		sc.close();
	}

}
