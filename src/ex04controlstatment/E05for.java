package ex04controlstatment;

public class E05for {

	public static void main(String[] args) {

		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("i = " + i);
		}
		
		int sum = 0;
		for(int num1 = 1 ; num1 <= 100 ; num1++) {
			sum += num1;
		}
		System.out.println("1~100까지 총 합 : "+ sum);
		
		//방법 1
		int sum2 = 0;
		for(int num = 1 ; num <= 10 ; num++) {
			if(num %2 == 0) {
				sum2 += num;
			}
		}
		System.out.println("1~10사이 2의 배수의 총 합 : "+ sum2);	
		
		//방법 2
		int sum3 = 0;
		for(int num = 0 ; num <= 10 ; num += 2) {
			sum3 += num;
		}
		System.out.println("1~10사이 2의 배수의 총 합 : "+ sum3);
		
		for(int dan = 2 ; dan <=9 ; dan++) {
			for(int su = 1 ; su <= 9 ; su++) {
				System.out.printf("%-2d*%2d=%2d",dan,su,(dan*su));
				System.out.print("|");
			}
		System.out.println();
		}
		
		
		
		for(int row = 1 ; row <= 4 ; row++) {
			for(int column = 1 ; column <= 4 ; column++) {
				if(row + column ==5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
		System.out.println();
		}
		
		
		
		
	}

}
