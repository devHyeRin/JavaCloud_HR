package ch04.quiz_function;

public class Quiz22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = i + 20;
		}
		
		funA(array);
		funB(array);
		funC(array);
		
		int eventCnt=funD(array);		// 짝수의 개수를 반환하는 함수
		int arraySum=funE(array);		// 배열의 수들의 합을 반환하는 함수
		int arrayMin=funF(array);		// 가장 작은 수의 위치(인덱스)를 반환하는 함수
		int arrayMax=funG(array);		//  가장 큰 수의 위치를 반환하는 함수
		
		System.out.println("짝수의 개수:" + eventCnt);
		System.out.println("배열의 수들의 합:" + arraySum);
		System.out.println("가장 작은 수의 위치 :" + arrayMin);
		System.out.println("가장 큰 수의 위치 :" + arrayMax);
		
		funH(array);						// 모든 양수의 수를 새로운 배열에 복사하는 함수
	}
	
	public static void funA(int[] array) {
		System.out.println("한줄에 10개씩 출력");
//		for(int i = 0; i < array.length / 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				System.out.print(array[j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		for(int i = 0; i < array.length;i++) {
			System.out.print(array[i] + "\t");
			
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	public static void funB(int[] array) {
		int count = 0;
		System.out.println("홀수만 출력");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i] + "\t");
				
				if(++count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	public static void funC(int[] array) {
		int count = 0;
		System.out.println("인덱스가 홀수인 수만 출력");
		
		for(int i = 0; i < array.length; i++) {
			if(i%2 != 0) {
				System.out.print(array[i] + "\t");
				
				if(++count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	
	public static int funD(int[] array){
		int count=0;
		
		for(int i=0;i<100;i++){
			if(array[i] %2 ==0) count++;
		}
		
		return count;
	}
	
	public static int funE(int[] array){
		int sum=0;
		
		for(int i=0;i<100;i++){
			sum +=array[i];
		}
		
		return sum;
	}
	
	public static int funF(int[] array){
		int temp=0;
		
		for(int i=0;i<100;i++){
			if(array[temp] > array[i]) temp=i;
		}	
		
		return temp;
	}
	
	public static int funG(int[] array){
		int temp=0;
		
		for(int i=0;i<100;i++){
			if(array[temp] < array[i]) temp=i;
		}		
		
		return temp;
	}
	
	public static void funH(int[] array){
		int[] evenArray=new int[100];
		
		int count=0;
		for(int i=0;i<100;i++){
			if(array[i] > 0) {
				evenArray[i]=array[i];
				++count;
			}
		}
		
		System.out.println("양수의 수:" + count);
	}

}
