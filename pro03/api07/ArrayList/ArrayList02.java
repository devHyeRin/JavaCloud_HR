package api07.ArrayList;

import java.util.ArrayList;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : Collection >> ArrayList 클래스
 * 순서 유지 index
 * 데이터 중복 가능
 */
public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a.get(1));
		System.out.println(a.toString());
		
		a.add(77);				//추가
		a.add(2, 88);			//추가
		a.add(0, 66);			//수정(교체)
		System.out.println(a.toString());
		
		a.remove(1);			//삭제
		System.out.println(a.toString());
		
		ArrayList<Object> b = new ArrayList<Object>();
		//자료형이 여러개 올 때 -> 최상위 클래스(Object)
		b.add("apple");	
		b.add(10);	
		b.add(55.5f);	
		b.add('A');	
		b.add(77.7);	
		
		System.out.println(b.toString());
		
	}

}
