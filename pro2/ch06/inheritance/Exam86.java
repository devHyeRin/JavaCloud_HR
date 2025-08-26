package ch06.inheritance;

/**
 * @날짜 :2025. 8. 26.
 * @작성자 : 이혜린
 * @설명 : 함수 재정의(overriding)
 */

class DParents {
	public void aa() {
	}

	public void bb() {
	}

	public void cc() {
	}

	public void dd() {
	}

	public void disp() {
		System.out.println("DParents CLASS");
	}

}

class DSon extends DParents {
	public void disp() {
		System.out.println("DSon CLass");
	}
}

public class Exam86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DParents d = new DParents();
		d.aa();
		d.bb();
		d.cc();
		d.dd();
		d.disp();

		DSon s = new DSon();
		s.aa();
		s.bb();
		s.cc();
		s.dd();
		s.disp();

	}

}
