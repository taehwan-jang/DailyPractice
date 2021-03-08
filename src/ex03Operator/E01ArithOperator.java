package ex03Operator;

public class E01ArithOperator {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 3;
		
 		System.out.println("덧셈: "+(num1+num2));
 		System.out.println("뺄셈: "+(num1-num2));
 		System.out.println("곱셈: "+(num1*num2));
 		System.out.println("나눗셈(몫): "+(num1/num2));
 		System.out.println("덧셈(나머지): "+(num1%num2));
 		
 		int result = 3 * 2 + 5 % 2 - 6 / 3 * 5;
 		System.out.println("결과는? " + result);
	}

}
