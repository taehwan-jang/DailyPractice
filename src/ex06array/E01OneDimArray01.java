package ex06array;

public class E01OneDimArray01 {

	public static void main(String[] args) {

		int[] numArr = new int[3];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
		
		System.out.println("배열명(numArr)="+ numArr);
		System.out.println("(numArr의 2번방의 값)="+ numArr[2]);
		System.out.println("====================");
		
		int[] arrNumber = new int[40];
		for(int i=0 ; i<arrNumber.length ; i++) {
				arrNumber[i] = i+10 ;
		}
		
		for(int i=0 ; i<arrNumber.length ; i++) {
			System.out.println(i +"번방의 값="+arrNumber[i]);
		}
		System.out.println("==================");
		
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int i=0 ; i<strArr.length ; i++) {
			System.out.println("strArr["+i+"]="+strArr[i]);
		}
		System.out.println("==================");
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법 1: 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0] = 100;
		System.out.printf("initArr[0]=%d\n\n",initArr[0]);
		
		System.out.println("방법 2: 선언과 동시에 초기화");
//		int[] initArr2 = new int[3] {1,20,30};
		int[] initArr2 = new int[] {1, 20, 30};
		System.out.printf("initArr2[0]=%d\n",initArr2[0]);
		System.out.printf("initArr2[1]=%d\n",initArr2[1]);
		System.out.printf("initArr2[2]=%d\n\n",initArr2[2]);
		
		System.out.println("방법 3: 초기값만으로 선언");
		int[] initArr3 = {11, 13, 17, 19, 23};
		int arrSum = 0;
		for(int i=0 ; i<initArr3.length ; i++) {
			arrSum += initArr3[i];
		}
		System.out.println("initArr 배열요소 합="+ arrSum);
		
		
		
		
		
		
	}
}
