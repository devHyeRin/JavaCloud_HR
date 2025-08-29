package api07.ArrayList;

import java.util.ArrayList;

/**
 * @날짜 :2025. 8. 29.
 * @작성자 : 이혜린
 * @설명 : Collection >> ArrayList 클래스
 */
public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");    	//[0]
		list.add("Oracle");   //[1]
		list.add("JSP");    		//[2]
		list.add("HTML");   	//[3]
		list.add("CSS");    	//[4]
		
		int size = list.size();
		System.out.println("저장된 총 객체 수 : " + size);
		
		String subject = list.get(2);
		System.out.println("2번 인덱스의 객체 얻기 : " + subject + "\n");
		
		//요소 출력 (반복문 방법)
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		//요소 출력 (toString() 방법)
		System.out.println(list.toString());
		
		//추가
		list.add("사과");        // 맨 마지막에 추가    
		list.add(1, "바나나");      // 1 인덱스에 추가
		System.out.println(list.toString());
		
		//교체(수정)
		list.set(3, "안녕하세요");
		System.out.println(list.toString());
		
		//삭제
		list.remove(0);
		System.out.println(list.toString());
		
		
		
		
		

		
		
	}

}
