package ch02.control;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		String name = "홍길동";
		int kor = 70;
		int eng = 80;
		int mat = 90;

		//연산
		int tot = kor + eng + mat;
		float avg = (float) tot / 3;

		char hakjum = 0; // 초기화 필수
		if (avg >= 90) {
			hakjum = '수';
		} else if (avg >= 80) {
			hakjum = '우';
		} else if (avg >= 70) {
			hakjum = '미';
		} else if (avg >= 60) {
			hakjum = '양';
		} else if (avg < 60) {
			hakjum = '가';
		}

		//출력
		System.out.println("name: " + name);
		System.out.println("평균: " + avg);
//		System.out.println("평가: " + hakjum);	 
//		에러가 나는 이유 ? -> hakjum 변수를 초기화 하지 않아서
		System.out.println("평가: " + hakjum);

	}

}
