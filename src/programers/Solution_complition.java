package programers;

import java.util.*;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> fail	= new ArrayList<String>();
        for(String a : participant) {
        	fail.add(a);
        }
        for(int i=0 ; i<completion.length ; i++) {
        	if(!(fail.remove(completion[i]))) {
        		return completion[i];
        	}
        }
        
        return answer;
    }
}
public class Solution_complition {

	public static void main(String[] args) {

	}

}
