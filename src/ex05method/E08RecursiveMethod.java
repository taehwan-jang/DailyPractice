package ex05method;

public class E08RecursiveMethod {

	public static void main(String[] args) {

		System.out.println("재귀함수를 이용하여 팩토리얼 구하기");
		System.out.println("4!: "+factorial(4));
		System.out.println("10!: "+factorial(10));
	}
	
	static int factorial(int num) {
		int result;
		if(num==1) {
			result = 1;
		}
		else {
			result = num*factorial(num-1);
		}
		System.out.println("계산과정:num = "+ num
				+", result = "+ result);
		return result;
	}

}
