package programers;

import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] numbers) {
        int[] temArr = new int[90];
        int count = 0;
        for(int i=0; i<numbers.length-1 ; i++) {
        	for(int j=i+1 ; j<numbers.length ; j++) {
        		boolean addOrNot=true;
        		int pickAdd = numbers[i]+numbers[j];
        		for(int k=0 ; k<count ; k++) {
        			if(pickAdd == temArr[k])
        				addOrNot=false;
        		}
        		if(addOrNot) {
        			temArr[count++]=pickAdd;
        		}
        		
        	}
        }
    	int[] answer = new int[count];
    	for(int i=0 ; i<answer.length ; i++) {
    		answer[i]=temArr[i];
    	}
    	Arrays.sort(answer);
        return answer;
    }

}
