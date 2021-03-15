package ex06array;

public class QuTwoDimArray {

    
    public static void main(String[] args) {        
        //배열선언
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7},
            {8, 9}
        };
        //값 증가전 출력
        arrPrint(arr);        
        //2만큼 증가시키는 메소드 호출
        addTwoArr(arr, 2);
        //증가후 출력
        arrPrint(arr);
    }
    static void addOneArr(int[] arr, int add) {
    	//가로에 대한 반복
    	
    	/*
    	addTwoArr()에서 전달해준 인자는 2차원 배열의 한 행씩이므로
    	해당 메소드에서는 1차원 배여르이 형태로 접근 가능함.
    	 */
    	for(int i=0; i<arr.length; i++){    
    		arr[i] += add; //질문해볼것.
    	}
    }
    //addOneArr() 메소드를 기반으로 2차원 배열을 증가시키는 메소드
    static void addTwoArr(int[][] arr, int add) {
    	/** 코드 삽입 **/
    	/*2차원 배열의 세로길이(크기)만큼 반복하면서 한행씩 addOneArr()로 전달한다.
    	이차원배열에서는 배열의 이름을 통해 세로길이를 얻어올 수 있다.
    	*/
    	for(int i=0 ; i<arr.length ; i++) {
    		addOneArr(arr[i],add);
		}
    	
    }
    
    //2차원 배열을 출력하기 위한 메소드
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
}

