package ex04controlstatment;

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
		
		
		/*
		while문을 활용하여 1~100사이 3 or 4의 배수의 합을 구하라
		 */
		
		int i1 = 1;
		int sum1 = 0;
		while(i1 <= 100) {
			if(i1 % 3 == 0 || i1 % 4 == 0)
				sum1 += i1;
			i1++;
		}
		System.out.println("1~100사이 3 or 4의 배수의 합 ="
		+ sum1);
		
		/*
        시나리오] 아래와 같은 모양을 출력하는 while문을 작성하시오
            출력결과
            1 0 0 0
            0 1 0 0
            0 0 1 0
            0 0 0 1
		 */
		
		int row = 1;
		while(row <= 4) {
			int column = 1;
			while(column <= 4) {
				if(row == column) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			column++;
			}
		System.out.println();
		row++;
		}
	}

}
