package ch07.interfaceA;

/**
 * @날짜 :2025. 8. 27.
 * @작성자 : 이혜린
 * @설명 : 추상클래스 (추상함수) 
 * 함수재정의 >> 추상클래스 >> 인터페이스
 */

abstract class Animal {
	public abstract void sound();
}

class Dog extends Animal {
	public void aa() {}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void bb() {}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class Exam96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();

		kind(dog);
		kind(cat);
	}
	
	public static void kind(Animal animal) {		//Upcasting 1. animal = dog m, 2. animal = cat
//		animal.sound();		//멍멍 -> 이렇게 쓰게 되면 자식 고유의 함수를 쓸 수 없음
		// 이걸 해결하려면 다운캐스팅 방법을 쓰면 됨
		
		//자식 고유의 함수 사용 방법(instance of, downcasting)
		if(animal instanceof Dog) {			// animal에 넘어온 게 dog니?
			Dog dog = (Dog) animal;		//DownCasting
			dog.aa();
			dog.sound();
			
		}else if(animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.bb();
			cat.sound();
	
		}
		
	}
	

}
