package ex05method;

import java.io.IOException;
import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) throws IOException{

		Scanner scanner = new Scanner(System.in);
		int excitC;
		
		do {
			System.out.print("입력할 횟수 : ");
			int countNum = scanner.nextInt();
			int maxValue = returnMaxNumber(countNum);
			
			System.out.println("최대값 : "+ maxValue);
			System.out.print("그만하려면 x 입력");
			excitC = System.in.read();
			
		}while(!(excitC=='x' || excitC=='X'));
		
	}
	static int returnMaxNumber(int num) {
		
		Scanner scanner = new Scanner(System.in);
		int maxValue=0;
		for(int i=1 ; i<=num ; i++) {
			System.out.printf("%d번째 숫자 : ",i);
			int inputNum = scanner.nextInt();
			if(i==1) {
				maxValue = inputNum;
			}
			else if(maxValue<inputNum) {
				maxValue = inputNum;
			}
			
		}return maxValue;
	}

}
