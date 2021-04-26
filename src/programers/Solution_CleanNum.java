package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_CleanNum {

	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	int[] a = new int[1];
	    	
	    	for(int i=0 ; i<arr.length ; i++) {
	    		if(arr[i]%divisor==0) {
	    			list.add(arr[i]);
	    		}
	    	}
	    	if(list.size()==0) {
	    		a[0]=-1;
	    		return a;
	    	}
	    	
	    	int[] answer = new int[list.size()];
	    	for(int i=0 ; i<list.size() ; i++) {
	    		answer[i]=list.get(i);
	    	}
	    	Arrays.sort(answer);
	    	
	        return answer;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
