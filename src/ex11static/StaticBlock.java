package ex11static;

public class StaticBlock {
	
	int instanceVar;
	void instanceMethod() {}
	
	static int staticVar;
	static void staticMethod() {
		
		int localVar;
		System.out.println("정적메소드");
		
	}
	
	static {
		
		staticVar = 1000;
		
		int localVar;
		localVar = 1000;
		System.out.println("localVar= "+ localVar);
		
		System.out.println("staticVar= "+ staticVar);
		staticMethod();
		System.out.println("==static block==");
		
	}
	
	public StaticBlock() {
		staticVar -= 1;
		System.out.println("==staticBlock의 생성자==");
	}
	

//	public static void main(String[] args) {
//
//		System.out.println("==메인메소드==");
//		
//		/*
//		localVar= 1000
//		staticVar= 1000
//		정적메소드
//		==static block==
//		==메인메소드==
//		출력결과를 보면 staticblock이 먼저 출력됨
//		method영역에 먼저 로드가 됨을 알 수 있음.
//		 */
//		
//		
//	}

}
