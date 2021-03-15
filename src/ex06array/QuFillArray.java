package ex06array;

import java.util.Scanner;

/*
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
*/
public class QuFillArray {

	public static void main(String[] args) {
		//입력받은 정수를 순서대로 입력할 배열
		int[] arr1 = new int[10];
		//홀,짝을 구분해서 입력할 배열
		int[] arr2 = new int[10];
		
		//arr2배열의 시작인덱스와 마지막인덱스를 저장할 변수(홀/짝 구분)
		int indexStart = 0;
		int indexEnd = arr2.length - 1;
		//사용자 입력을 위한 객체 생성
		Scanner scanner = new Scanner(System.in);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print("채울 숫자를 입력하세요: ");
			int inputNum = scanner.nextInt();
			//첫번째 배열에는 입력한 순서대로 채워준다.
			arr1[i] = inputNum;
			
			if(inputNum%2!=0) {
				//홀수이면
				arr2[indexStart++] = inputNum;
			}
			else {
				//짝수이면
				arr2[indexEnd--] = inputNum;
			}
			
		}
		System.out.println("첫번재 배열 출럭");
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n두번째 배열 출력");
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
