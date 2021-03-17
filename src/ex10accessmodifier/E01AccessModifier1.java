package ex10accessmodifier;

class DefaultClass1 {
	
	void myFunc() {
		
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
}


public class E01AccessModifier1 {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod()메소드 호출");
		
	}
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod()메소드 호출");
	}
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod()메소드 호출");
	}
	
}
