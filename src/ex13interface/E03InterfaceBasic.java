package ex13interface;


interface MyInterface1 {
	
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL = 1.9999999999999;
	
	public abstract void absFunc1();
	void absFunc2();
}
interface MyInterface2 {
	void absFunc2();
}
class SimpleClass{
	int simple =1;
	void mySimple() {
		System.out.println("simple="+simple);
	}
}
class MyClass extends SimpleClass implements MyInterface1,MyInterface2{
	
	@Override
	public void absFunc1() {
		System.out.println("absFunc1()호출");
	}
	@Override
	public void absFunc2() {
		System.out.println("absFunc2()호출");
	}
}

public class E03InterfaceBasic {

	public static void main(String[] args) {

		MyInterface1 myclass1 = new MyClass();
		myclass1.absFunc1();
		myclass1.absFunc2();
		
		MyInterface2 myclass2 = new MyClass();
		((MyInterface1)myclass2).absFunc1();
		myclass2.absFunc2();
		
//		myclass2.mySimple();
		((SimpleClass)myclass2).mySimple();

		
		
	}

}
