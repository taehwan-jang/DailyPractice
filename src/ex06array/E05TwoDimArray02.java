package ex06array;
// 이거 내일 한번 더해 ㅅㅂ 개병신짓 왜 출력메소드를 안씀?하 
public class E05TwoDimArray02 {

	public static void main(String[] args) {

		int[][] arr2Dim = new int[3][4];
		
		for(int i=0 ; i<arr2Dim.length ; i++) {
			for(int j=0 ; j<arr2Dim.length ; j++) {
				arr2Dim[i][j] = i+j;
			}
		}
		
		for(int i=0 ; i<arr2Dim.length ; i++) {
			for(int j=0 ; j<arr2Dim.length ; j++) {
				System.out.print(arr2Dim[i][j]+" ");
			}
			System.out.println();
		}
		/*
		시나리오] 다음 절차에 따라 프로그램을 작성하시오.
		1. 2차원 배열을 선언한다. 세로3 가로4
		2. 난수를 이용하여 배열을 초기화한다.
		3. 배열전체요소를 매개변수로 전달된 정수만큼
			증가시킨다.
		4. 증가되기 전, 후 배열을 출력한다.
		5. 다음 메소드명으로 구현한다. twoDimPlus()
		 */
		
		int[][] array2Dim = new int [3][4];
		
		for(int i=0 ; i<array2Dim.length ; i++) {
			for(int j=0 ; j<array2Dim.length ; j++) {
				array2Dim[i][j] = (int)(Math.random()*100);
			}
		}
		System.out.println("증가메소드 호출 전 출력");
		for(int i=0 ; i<array2Dim.length ; i++) {
			for(int j=0 ; j<array2Dim.length ; j++) {
				System.out.printf(" [%d][%d]: %d",
						i,j,array2Dim[i][j]);
			}
			System.out.println();
		}
		twoDimPlus(array2Dim,7);
		System.out.println("증가메소드 호출 후 출력");
		for(int i=0 ; i<array2Dim.length ; i++) {
			for(int j=0 ; j<array2Dim.length ; j++) {
				System.out.printf(" [%d][%d]: %d",
						i,j,array2Dim[i][j]);
			}
			System.out.println();
		}
		
	}
	static void twoDimPlus(int[][] ar, int addVal) {
		for(int i=0 ; i<ar.length ; i++) {
			for(int j=0 ; j<ar.length ; j++) {
				ar[i][j] += addVal;
			}
		}
	}

}
