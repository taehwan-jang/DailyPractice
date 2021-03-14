package ex05method;

public class E08RecursiveError {

	public static void main(String[] args) {

		showHi(3);
	}
	
	static void showHi(int cnt) {
		System.out.println("hi");
		System.out.println("cnt="+cnt);
		
//		showHi(--cnt);
//		if(cnt==1) {
//			return; => if문을 만날 수 없는 조건이라 무한루프
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
	}

}
