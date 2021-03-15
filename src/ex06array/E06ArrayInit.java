package ex06array;

public class E06ArrayInit {

	public static void main(String[] args) {

		int[] arr = new int[3];
		System.out.println("arr[0]="+arr[0]);
		
		int[][] arr2 = new int[3][4];
		System.out.println("arr2Dim[0]="+arr2[0][0]);
		System.out.println("arr2Dim[2]="+arr2[2][0]);
		
		System.out.println("배열 선언과 동시에 초기화");
		int[] arrDim = {1, 2, 3};
		System.out.println("arrDim[0]="+arrDim[0]);
		
		int[][] arr2Dim = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		System.out.println("arr2Dim[0][0]:"+arr2Dim[0][0]);
		System.out.println("arr2Dim[0][1]:"+arr2Dim[0][1]);
//		System.out.println("arr2Dim[0][2]:"+arr2Dim[0][2]);
//		위에건 선언후 바로 초기화했기 때문에 빈공간이 null로 채워짐 그래서 호출할게
//		없지
		
	}

}
