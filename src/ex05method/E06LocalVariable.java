package ex05method;

public class E06LocalVariable {

	public static void main(String[] args) {

		boolean scope = true;
		
		if(scope) {
			int num=1;
			num++;
			System.out.println("[1번 if문 지역]"+num);
		}
		else {
			int num=5;
			System.out.println("[1번 if문의 else지역]"+num);
		}
		
		int num=100;
		System.out.println("[main메소드 지역]"+num);
		
		System.out.println("[simple메소드 호출]");
		simpleFunc();
		System.out.println("[simple메소드 끝]");
		System.out.println("[main메소드 끝]"+num);
	}
	
	static void simpleFunc() {
		int num = 1000;
		System.out.println("[simple메소드 지역]"+num);
	}

}
