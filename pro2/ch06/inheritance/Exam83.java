package ch06.inheritance;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 상속
 */

class Man{
	protected String name;		//사원이름
	
	public void empName() {
		System.out.println("이름 : " + name);
	}
}

class BusinessMan extends Man{
	private String company;
	private String position;
	
	public BusinessMan() {}
	
	public BusinessMan(String name, String company, String position) {
		super.name = name;
		this.company = company;
		this.position = position;
	}
	
	public void info() {
		empName();
		this.empName();
		super.empName();
		
		System.out.println("회사이름 : " + company);
		System.out.println("직급 : " + position);
	}
}

public class Exam83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessMan bm = new BusinessMan("홍길동", "우리IT", "개발자");
		bm.info();
	}

}
