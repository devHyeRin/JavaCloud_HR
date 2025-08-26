package ch05.quiz_object1;

import java.util.Scanner;

class SungJuk{
	private String name;
	private int kor, eng, mat, tot;
	private float avg;
	private Scanner sc;
	
	private static int banTot;
	private static float banAvg;
	private static int inwon;
	
	public SungJuk() {
		
		++inwon;
		
		sc = new Scanner(System.in);
	
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		System.out.println();
	}
	
	public void total() {
		tot = kor + eng + mat;
	}
	
	public void average() {
		avg = (float)tot / 3;
	}
	
	public void banTotal() {
		banTot = banTot + tot;
	}
	
	public void banAverage() {
		banAvg = banTot / (inwon * 3);
	}
	
	public void disp() {
		System.out.println(name + "\t\t" + kor + "\t\t" + eng + "\t\t" + mat + "\t\t" + tot + "\t\t" + avg);
	}
	
	public static void title() {
		System.out.println("이름\t\t" + "국어\t\t" + "영어\t\t" + "수학\t\t" + "총점\t\t" + "평균\t\t");
	}
	
	public static void banDisp() {
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.print("반총점 : " + banTot + "\t\t");
		System.out.print("반평균 : " + banAvg + "\t\t");
		System.out.print("인원수 : " + inwon);
	}
}


public class Quiz30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int inwon = sc.nextInt();
		
		SungJuk[] sj = new SungJuk[inwon];
		
		for(int i = 0; i < sj.length; i++) {
			sj[i] = new SungJuk();
		}
		
		SungJuk.title();
		for(int i = 0; i < sj.length; i++) {
			sj[i].total();
			sj[i].average();
			sj[i].disp();
			sj[i].banTotal();
			sj[i].banAverage();
		}
		SungJuk.banDisp();
		
		sc.close();
	}

}
