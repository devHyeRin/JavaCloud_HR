package api01.Object;

public class CSmartPhone {
	private String company;
	private String os;
	
	public CSmartPhone() {}

	public CSmartPhone(String company, String os) {
//		super();		// Object 클래스의 default 생성자 호출
		this.company = company;
		this.os = os;
	}
	
	public void disp() {
		System.out.println(company + "\t\t" + os);
	}

	@Override
	public String toString() {
		return "CSmartPhone [company=" + company + ", os=" + os + "]";
	}
	
}
