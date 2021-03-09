package ex04controlstatment;

import ex01start.E02SystemOutPrintln;

public class E03While {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1~10까지의 합은 : " + sum);
		
		/*
		시나리오]구구단을 출력하는 프로그램을 작성하시오. 단 While문을 사용할 것;
		 */
		
		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su <= 9) {
				System.out.printf("%-2d*%2d =%2d", dan, su, (dan*su));
				System.out.print("|");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("구구단 끝");
		
		
		
	}

}
