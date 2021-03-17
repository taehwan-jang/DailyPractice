package ex09package;

import ex09package.kosmo.perimeter.Circle;

public class E02CircleMain {

	public static void main(String[] args) {

		ex09package.kosmo.area.Circle circle1 =
				new ex09package.kosmo.area.Circle(6.5);
		System.out.println("반지름 6.5인 원의 넓이: "+circle1.getArea());
		
		Circle circle2 = new Circle(4.5);
		System.out.println("반지름이 4.5인 원의 둘레: "+circle2.getPerimeter());
	}
}
