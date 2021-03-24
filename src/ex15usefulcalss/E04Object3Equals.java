package ex15usefulcalss;

class MyClass {
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyClass) {
			MyClass mc = (MyClass)obj;
			if(mc.data==this.data) {
				System.out.println("data같음");
			}
			else {
				System.out.println("data다름");
			}
		}
		System.out.println("MyClass객체 아님");
		return false;
	}
	
}
class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point po = (Point)obj;
			if(po.x==this.x && po.y==this.y) {
				System.out.println("같음");
			}
			else {
				System.out.println("다름");
			}
		}
		System.out.println("클래스가 다름");
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x="+String.valueOf(x)+", y="+String.valueOf(y);
	}
}

public class E04Object3Equals {

	public static void main(String[] args) {

		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("두 객체 equals()메소드로 비교");
		
		if(mc1==mc2) {
			System.out.println("인스턴스의 참조값같음");
		}
		else {
			System.out.println("인스턴스의 참조값다름");
		}
		System.out.println(mc1.equals(mc2)?"같다":"다르다"); 
		
		System.out.println("두 객체의 toString()호출");
		System.out.println(mc1.toString());
		System.out.println(mc2.toString());
		
		Point pos1 = new Point(10,20);
		Point pos2 = new Point(10,30);
		
		System.out.println("두 객체를 equals로 비교");
		System.out.println(pos1.equals(pos2)?"같다":"다르다");
		
		System.out.println(pos1.toString());
		System.out.println(pos2.toString());
		System.out.println(pos1);
		System.out.println(pos2);
		
	}

}
