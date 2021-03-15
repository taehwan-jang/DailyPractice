package ex06array;

public class QuTwoDimLotate {

	public static void main(String[] args) {

//		int[][] arr = new int[3][3];
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		arrPrint(arr); //배열초기화 직후 출력
		rotateArr(arr);
		arrPrint(arr); //행 이동 후 출력1
		rotateArr(arr);
		arrPrint(arr); //행 이동 후 출력2
		rotateArr(arr);
		arrPrint(arr); //행 이동 후 출력3
	}
	static void arrPrint(int[][] arr) {
        /** 코드 삽입 **/
    	//세로의 길이(크기)만큼 반복 
    	System.out.println("========출력구분선=========");
    	for(int i=0 ; i<arr.length ; i++) {
    		//가로의 길이(크기)만큼 반복
    		for(int j=0 ; j<arr[i].length ; j++) {
    			//각 요소를 출력
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
	static void rotateArr(int[][] arrParam) {
		/*
		진행절차
			1.배열의 마지막행을 1차원배열 변수에 임시로 저장한다.
			2.배열의 2행을 3행으로, 1행을 2행으로 옮긴다.
			3.1번에서 임시로 저장했던 값을 1행으로 옮긴다.
			
			※2차원배열에서 "배열이름[인덱스]"가 하나의 행(세로행)을
			가리킨다는 것을 활용하는 문제임.
			
		 */
		//절차1
		int[] lastRow = arrParam[arrParam.length-1];
		//절차2
		for(int row=arrParam.length-1 ; row>0 ; row--) {
			arrParam[row] = arrParam[row-1];
		}
		//절차3
		arrParam[0] = lastRow;
	}
	

}
