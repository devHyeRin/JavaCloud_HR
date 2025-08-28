package ch07.interfaceA;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] phone = new Phone[3];
		phone[0] = new APhone();
		phone[1] = new BPhone();
		phone[2] = new CPhone();
		
		for(int i = 0; i < phone.length; i++) {
			phone[i].callSend();
			phone[i].canData();
			phone[i].tvRemote();
			System.out.println();
			
		}
	}

}
