package ex05method;

public class E02MetodType01 {

	public static void main(String[] args) {

		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
		
	}
	static void noParamNoReturn() {
		
		System.out.println("=====메뉴 선택=====");
		System.out.println("1.열기 2.계속 3.종료");
		System.out.println("================");
	}
	static void noParamNoReturn2() {
		
	}
	static void noParamNoReturn2(int a) {
		
	}
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[return문 이전]");
		
		if(returnValue %2 ==0) {
			System.out.println(returnValue+"는 짝수");
		}
		else{
			System.out.println(returnValue+"는 홀수");
		}
	}

}
