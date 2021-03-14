package ex05method;

import java.util.Scanner;

public class E04MethodType03_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력 :");
		int fNum = scanner.nextInt();
		System.out.println("두번째 숫자를 입력 :");
		int sNum = scanner.nextInt();
		
		yesParamNoReturn(fNum,sNum);
	}
	
	static void yesParamNoReturn(int a, int b) {
		
		int sum = 0;
		System.out.print("결과 : ");
		for(int i=a ; i<=b ; i++) {
			sum += i;
			if(i==b) {
				System.out.print(i);
				break;
			}
			System.out.print(i+"+");
		}
		System.out.print("="+sum);	
	}
	

}
