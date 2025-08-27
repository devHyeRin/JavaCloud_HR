package ch07.interfaceA;

public class BPhone implements Phone {

	@Override
	public void callSend() {
		System.out.println("전화 송수신 가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("5G");
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨 탑재");
	}

}
