package ex04controlstatment;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	public static void main(String[] args) throws IOException {

		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println("1~10 총합 = " + sum);
		
		int j = 1;
		int sum1 = 0;
		do {
			if(j %4 == 0 || j % 7 == 0)
				sum1+=j;
			j++;
		}while(j<=1000);
		System.out.println("1~1000사이 4 or 7의 배수 : "
				+ sum1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 :");
		int kor = scanner.nextInt();
		System.out.print("영어 :");
		int eng = scanner.nextInt();
		System.out.print("수학 :");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균 : %.2f\n",avg);
		int exitCode;
		
		do {
			switch((int)avg/10) {
			case 10:case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default :
				System.out.println("F학점");
			}
			System.out.println("x를 누르면 종료됩니다.: ");
			System.out.println("계속하려면 아무키나 누르세요.: ");
			exitCode = System.in.read();
				
			
		}while(!(exitCode == 'x' || exitCode == 'X'));
	}

}
