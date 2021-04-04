package programers;

public class Solution_game {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] crane = new int[100];
        int index=0;
        
        for(int i=0 ; i<moves.length ; i++) {
        	for(int j=0 ; j<board.length ;j++) {
        		if(board[j][moves[i]-1]!=0) {
        			crane[index++] = board[j][moves[i]-1];
        			board[j][moves[i]-1]=0;
        			System.out.print(crane[index-1]+" ");
        			if(index>1) {
	    				if(crane[index-1]==crane[index-2]) {
	    					crane[index-1]=crane[index-2]=0;
	    					index-=2;
	    					answer+=2;
	    				}
        			}
        			if(index==1) {
        				if(crane[index-1]==crane[index]) {
        					crane[index-1]=crane[index]=0;
        					index--;
        					answer+=2;
        				}
        				
        			}
        			
        			break;
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] arr = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] arr2 = {1,5,3,5,1,2,1,4};
//		System.out.println(solution(arr,arr2));
	}

}
