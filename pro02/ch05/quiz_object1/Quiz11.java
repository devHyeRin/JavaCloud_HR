package ch05.quiz_object1;

import java.util.Scanner;

class Employee {
	public String name;
	public String sabun;
	public int age;
	public String title;
	public String dept;
	public String grade;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("사번 : ");
		sabun = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("직함 : ");
		title = sc.next();
		
		System.out.print("근무부서 : ");
		dept = sc.next();
		
		System.out.print("인사등급 : ");
		grade = sc.next();
		
		sc.close();
	}

	public void output() {
		System.out.println(name + "\t" + sabun + "\t" + age + "\t" + title + "\t" + dept + "\t" + grade);
	}
}

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.input();
		emp.output();
	}

}
