package ex06array;

public class E05TwoDimArray01 {

	public static void main(String[] args) {

		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		System.out.println("배열의 세로몇줄?:"+ arr.length);
		System.out.println("배열의 참조값:"+ arr);
		System.out.println("배열의 참조값:"+ arr[0]);
		System.out.println("배열의 참조값:"+ arr[1]);
		System.out.println("배열의 참조값:"+ arr[2]);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d행의 크기: %d\n",
						i,arr[i].length);
		}
		for(int j=0 ; j<arr.length ; j++) {
			System.out.printf("%d행 주소값 출력(주소값): %s\n",
						j,arr[j]);
		}
		System.out.println("배열 출력하기"+arr);
		System.out.println("arr[0][1]:"+arr[0][1]);
		
		
	}

}
