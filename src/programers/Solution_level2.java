package programers;


public class Solution_level2 {

    public static int solution(int[][] board){
    	//                 2,2
    	for(int i=0 ; i<board.length; i++) {
    		for(int j=0 ; j<board[i].length;j++) {
    			if(board[i][j]==1 && board[i][(board.length-1)+j]==1
    					&& board[(board.length-1)-i][j]==1 && 
    					board[(board.length-1)-i][(board.length-1)+j]==1) {
    				return (board.length-i)*(board.length-i);
    			}
    		}
    	}
    	
        int answer = 1234;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    public static void main(String[] args) {
		int[][] board = {{0,0,1,1},{1,1,1,1}};
		System.out.println(solution(board));
	}
}
