package ex05method;

public class E03MethodType02_1 {

	public static void main(String[] args) {

		System.out.println("1~10까지의 합 : "+noParamYesReturn());
		
		int sum10 = noParamYesReturn();
		System.out.printf("1~10까지의 합은 %d입니다.",sum10);
	}
	
	static int noParamYesReturn() {
		
		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		return sum;
	}

}
