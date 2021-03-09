package ex04controlstatment;

public class E01If02 {

	public static void main(String[] args) {
		
		int num = 101;
		
		if(num %2 == 0) {
			System.out.printf("%d은 짝수 입니다.\n", num);
		}
		else {
			System.out.printf("%d은 홀수 입니다.\n", num);
		}
		
		String numResult = (num %2 == 0) ? "짝수" : "홀수";
		System.out.printf("숫자 %d는 %s입니다.\n", num, numResult);
		
		int num2 = 120;
		String JJak = "짝수";
		String Holl = "홀수";
		
//		if(num2 %2 == 0) {
//			if(num2 >= 100) {
//				System.out.printf("%d은 %s이고 100이상", num2, JJak);
//			}
//			else {
//				System.out.printf("%d은 %s이고 100미만", num2, JJak);
//			}
//		}
//		else {
//			if(num >= 100) {
//				System.out.printf("%d은 %s이고 100이상", num2, Holl);
//			}
//			else {
//				System.out.printf("%d은 %s이고 100미만", num2, Holl);
//			}
//		}
		
		if(num2 %2 == 0 && num2 >=100) {
			System.out.printf("%d은 %s이고 100이상", num2, JJak);
		}
		else if(num2 %2 == 0 && num2 <=100) {
			System.out.printf("%d은 %s이고 100미만", num2, JJak);
		}
		else if(num2 %2 != 0 && num2 >=100) {
			System.out.printf("%d은 %s이고 100이상", num2, Holl);
		}
		else {
			System.out.printf("%d은 %s이고 100미만", num2, Holl);
		}
	}
}
