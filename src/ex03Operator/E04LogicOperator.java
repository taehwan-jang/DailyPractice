package ex03Operator;

public class E04LogicOperator {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20;
		
		boolean result1 = (num1 == 100 && num2 ==20);
		boolean result2 = (num1 == 100 || num2 ==20);
		boolean result3 = (num1 <= 100 || num2 >= 20);
		
		System.out.println("result1의 결과 : " + result1);
		System.out.println("result2의 결과 : " + result2);
		System.out.println("result3의 결과 : " + result3);
		
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 같지 않습니다.");
		}
		else {
			System.out.println("num1과 num2는 같습니다.");
		}
		int num = 10 % 2;
		System.out.println(num);
	}

}
