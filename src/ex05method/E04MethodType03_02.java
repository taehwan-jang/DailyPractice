package ex05method;

import java.util.Scanner;

public class E04MethodType03_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자 :");
		int sNum = scanner.nextInt();
		System.out.print("\n두번째 숫자 :");
		int eNum = scanner.nextInt();
		
		guGuDan(sNum,eNum);
	}
	
	static void guGuDan(int start, int end) {
		for(int i=start ; i<=end ; i++ ) {
			for(int j=1 ; j<=9 ; j++) {
				System.out.printf("%-2d*%2d=%3d",i,j,(i*j));
				System.out.print("|");
			}
			System.out.println();
		}
	}

}
