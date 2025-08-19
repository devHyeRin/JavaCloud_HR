package ch02.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "과장";
		String money = "";
		
		switch(position) {
		case "부장":
			money = "700만원";
			break;
		case "과장":
			money = "500만원";
			break;
		case "대리":
			money = "300만원";
			break;
		case "사원":
			money = "200만원";
			break;
		default:
			System.out.println("잘못 선택");
			break;
		}
		System.out.println(money);
	}

}
