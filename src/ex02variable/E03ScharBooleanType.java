package ex02variable;

public class E03ScharBooleanType {

	public static void main(String[] args) {

		char ch1 = '가';
//		char chStr = "가나다라";
		String chStr = "가나다라";
		System.out.println("ch1= " + ch1);
		System.out.println("chStr= " + chStr);
		
		char ch2 = 'A';
		int num1 = 2; 
		int num2 = ch2 + num1;
		System.out.println("num1 = " + num1);
		System.out.println("(char)num2 = " + (char)num2);
		
		char ch3 = (char)(ch2 + num1);
		System.out.println("ch3(문자출력)="+ ch3);
		System.out.println("ch3(아스키코드출력)="+ (int)ch3);
		
		char ch4 = '1';//숫자가 아닌 문자이므로 49로 저장된다.
		char ch4_1 = '1' + 1;
		System.out.println("ch4 =" + ch4 +", ch4_1 = "+ ch4_1 +", ch4_1 =" + (int)ch4_1);
		
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1 + "bn2 = " + bn2);
		
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And) = " + bn3);
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or) = " + bn3);
		
		bn3 = '가' > 30000; //가 -> 유니코드 44032 이므로 true 반환됨
		System.out.println("bn3 = " + bn3);
		
	}

}
