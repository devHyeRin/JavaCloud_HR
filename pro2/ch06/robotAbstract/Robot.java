package ch06.robotAbstract;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 상속 - 추상 클래스
 * 시나리오 1) 로봇 모양은 팔, 다리, 머리, 몸통으로 이루어져 있습니다.
 * 					2) 로봇은 기본적으로 걷고, 달릴 수 있어야 합니다.
 * 					3) 로봇 종류에 따라 날 수 있으며, 미사일을 쏠 수 있고, 검을 가지고 있을 수 있습니다.
 * 						3-1) Super 로봇은 날 수 있고, 미사일 쏠 수 있고, 레이저 검을 가지고 있다.
 * 						3-2) Standard 로봇은 날 수는 없지만, 미사일 쏠 수 있고, 목검을 가지고 있다.
 * 						3-3) Low 로봇은 날 수도 없고, 미사일 쏠 수도 없고, 검도 없다.
 * 
 */
abstract public class Robot {
	protected String kind;
	
	public void shape() {
		System.out.println(kind + "는 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	public void actionWalk() {
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun() {
		System.out.println("달릴 수 있습니다.");
	}
	
	public abstract void actionFly();
	
	public abstract void actionMisail();
	
	public abstract void actionKinfe();
}
