package api07.ArrayList;

import java.util.ArrayList;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : ArrayList <Data>
 */
public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data a = new Data(10, 20);
		Data b = new Data(30, 40);
		Data c = new Data(50, 60);
		
		ArrayList<Data> list = new ArrayList<Data>();
		list.add(a);     //[0]
		list.add(b);     //[1]
		list.add(c);     //[2]
		
		for(int i = 0; i < list.size(); i++) {
			Data ab = list.get(i);
			ab.yonsan();
			System.out.println(ab.toString());
		}
		
		//추가
		list.add(new Data(1, 2));
		list.add(2, new Data(3, 4));
		
		//수정
		list.set(0, new Data(5, 6));
		for(int i = 0; i < list.size(); i++) {
			Data ab = list.get(i);
			ab.yonsan();
			System.out.println(ab.toString());
		}
		
		//삭제
		list.remove(0);
		
		
		//제네릭 타입은 Object로 하는 경우
//		ArrayList<Object> list = new ArrayList<Object>();
//		list.add(a);     //[0]
//		list.add(b);     //[1]
//		list.add(c);     //[2]
//		
//		for(int i = 0; i < list.size(); i++) {
//			Object ab = (Data)list.get(i);   다운캐스팅 해야함
//			ab.yonsan();
//			System.out.println(ab.toString());
//		}
		
	}

}
