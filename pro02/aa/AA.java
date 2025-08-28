package aa;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 접근제한자
 */
public class AA {
	private int x = 10;		//같은 클래스 내
	protected int y = 20;  // 상속가능, 동일 패키지
	public int z = 30;
	int su = 40;				// default, 동일패키지
	//패키지가 달라지면 상속 안해줌
}
