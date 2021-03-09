package ex03Operator;

public class E08BitShiftOperator {

	public static void main(String[] args) {

		System.out.println("2의 1+1승: " + (2 << 1));
		System.out.println("2의 2+1승: " + (2 << 2));
		System.out.println("2의 3+1승: " + (2 << 3));
		System.out.println("2의 4+1승: " + (2 << 4));
		System.out.println("=======================");
		
		int num = 8;
		int sh1 = 1, sh2 = 2, sh3 = 3, sh4 = 4, sh5 = 5;
		
		System.out.println("Right Sift 연산자");
		System.out.println(num >> sh1);
		System.out.println(num >> sh2);
		System.out.println(num >> sh3);
		System.out.println(num >> sh4);
		System.out.println(num >> sh5);
		System.out.println("========================");			
		System.out.println(num >>> sh1);
		System.out.println(num >>> sh2);
		System.out.println(num >>> sh3);
		System.out.println(num >>> sh4);
		System.out.println(num >>> sh5);
		System.out.println("========================");	
		System.out.println("Lftt Sift 연산자 비트를 옆 숫자만큼 이동시킴");
		System.out.println(num << sh1);
		System.out.println(num << sh2);
		System.out.println(num << sh3);
		System.out.println(num << sh4);
		System.out.println(num << sh5);
		System.out.println("========================");			
		
	}

}
