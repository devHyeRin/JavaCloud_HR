package ch05.quiz_object1;

class Circle{
	public double radius;
	public double result;
	
	public void getRadius(double r) {
		radius = r;
	}
	
	public void findArea() {
		result = radius * radius * 3.14159;
	}
	
	public void disp() {
		System.out.println("원의 면적 : " + result);
	}
}

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
	}

}
