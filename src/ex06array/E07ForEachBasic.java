package ex06array;

public class E07ForEachBasic {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("[기본 for문 합계]: "+sum);
		
		sum=0;
		for(int a : arr) {
			System.out.print(a+" ");
			sum += a;
		}
		System.out.println("\n[foreach문 합계]: "+sum);
		
		System.out.println("[배열arr의 요소값에 1 증가]");
		for(int a : arr) {
			a++;
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println("[배열arr의 요소값 재출력]");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println("[2차원배열의 요소값 출력 및 1더하기]");
		int[][] twoDim = {{1,2,3},{10,20,30},{100,200,300}};
		
		for(int[] a : twoDim) {
			for(int b : a) {
				b++;
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
