package programers;

import java.util.Arrays;

public class Solution_budget {

	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0 ; i<d.length ; i++) {
        	if(budget>=d[i]) {
        		budget -= d[i];
        		answer++;
        	}
        }
          
        return answer;
    }
	
	public static void main(String[] args) {
		
		
		
	}
	

}

