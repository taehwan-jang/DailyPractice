package ex13interface;

abstract class AbsClass1 {
	
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	int instanceVar;
	static int staticVar;
	
	void instanceMethod() {}
	static void staticMethod() {}
}
class AbsClassChild1 extends AbsClass1 {
	
	int newVar;
	void newMethod() {}
	
	@Override
	void instanceMethod() {
		System.out.println("필요없으면 오버라이딩 안해도 됨");
	}
	
}
abstract class AbsClass2 {
	abstract void absMethod(int number);
}
class AbsClassChild2 extends AbsClass2 {
	@Override
	void absMethod(int number) {
		System.out.println("부모클래스에서 오버라이딩한 메소드가"
				+ "없을땐 에러 발생함");
	}
	void newMethod() {
		System.out.println("자식클래스에서 새롭게 확장한 메소드");
	}
}


public class E01AbstractBasic {

	public static void main(String[] args) {
//		추상클래스는 객체를 생성할 수 없다.
//		AbsClass1 absClass1 = new AbsClass1();
//		추상클래스를 상속한 하위클래스는 추상클래스가 아닌이상 객체생성이 가능하다
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		AbsClass2 absClass2 = new AbsClassChild2();
		absClass2.absMethod(100);
		((AbsClassChild2)absClass2).newMethod();
		
		/*
		추상클래스내에 선언된 정적멤버는 오버라이딩의 대상이
		아니므로 static이 가진 기본 규칙을 따른다. 즉 클래스명으로
		접근하면 된다.
		 */
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		
	}
}
