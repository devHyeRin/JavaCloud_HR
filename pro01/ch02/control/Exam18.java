package ch02.control;

public class Exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 if문

		int score = 84;
		String grade = "";

		if (score >= 90) {
			if (score >= 97) { // 100~97
				grade = "A+";
			} else if (score >= 94 && score <= 96) {
				grade = "AO";
			} else if (score <= 93) {
				grade = "A-";
			}
		} else if (score >= 80) {
			if (score >= 87) {
				grade = "B+";
			} else if (score >= 84 && score <= 86) {
				grade = "BO";
			} else if (score <= 83) {
				grade = "B-";
			}
		} else if (score >= 70) {
			if (score >= 77) {
				grade = "C+";
			} else if (score >= 76 && score <= 74) {
				grade = "CO";
			} else if (score <= 73) {
				grade = "C-";
			}
		} else if (score < 70) {
			grade = "재수강!!!";
		}

		System.out.println("학점: " + score + "\t" + grade);

	}

}
