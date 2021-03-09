package ex04controlstatment;

public class E01If01 {

	public static void main(String[] args) {

		int num = 10;
		
//		if(num%2) {
//			System.out.println("잘못된 조건식 입니다.");
//		}
//		if(num) {
//			System.out.println("이것도 잘못된 조건식 입니다.");
//		}
		
		if(num%2 == 0) {
			System.out.printf("%d는 짝수 입니다.", num);
		}
		if(num%2 == 0 && num >= 10) {
			System.out.printf("%d는 짝수이고 10보다 크거나 같습니다.\n", num);
		}
		
		if(true) {
			System.out.println("true는 무조건 실행되는 조건문 입니다.");
		}
		
//		if(num2 %2 != 0); ->;으로 끝나서 if문이 끝남
//			System.out.println("%d는 홀수 입니다.", num);
		
		if(num%2 == 0) // if문 단독일때 {} 중괄호 생략 가능
			System.out.println("\n" + num +"은 짝수 입니다." );
		
		if(num%2 != 0) {
			System.out.println("num은 " + num + "입니다.");
			System.out.println(num + "은 홀수 입니다.");
		}
	}

}
