package ex05method;

import java.util.Scanner;

public class E05MethodType04_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수를 입력하세요: ");
		int stuCount = scanner.nextInt();
		int sumAge=ageSumReturn(stuCount);
		System.out.printf("\n%d명의 학생 나이 합 : %d",stuCount,sumAge);
		
		
	}
	
	static int ageSumReturn(int sNum) {
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;
		for(int i=1 ; i<=sNum ; i++) {
			System.out.printf("\n%d번째 학생의 나이 : ",i);
			int age = scanner.nextInt();
			sumAge += age;
			
		}
		return sumAge;
	}

}
