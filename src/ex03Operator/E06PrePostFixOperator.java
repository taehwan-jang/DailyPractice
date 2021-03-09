package ex03Operator;

public class E06PrePostFixOperator {

	public static void main(String[] args) {

		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;
		num3 = --num1;
		System.out.println("전위증가/감소시");
		System.out.printf("num1 : %d, num2 : %d, num3 : %d %n%n", num1, num2, num3);
		
		num1 = 7;
		num2 = num1++;
		num3 = num1--;
		System.out.println("후위증가/감소시");
		System.out.printf("num1 : %d, num2 : %d, num3 : %d %n%n", num1, num2, num3);
	}

}
