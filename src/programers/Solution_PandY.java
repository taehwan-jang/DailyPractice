package programers;

import java.util.ArrayList;

class Solution2 {
    boolean solution(String s) {
        ArrayList<Integer>listP = new ArrayList<Integer>();
        ArrayList<Integer>listY = new ArrayList<Integer>();
        
        for(int i=0 ; i<s.length() ;i++) {
        	if(s.charAt(i)=='P'||s.charAt(i)=='p') {
        		listP.add(i);
        	}
        	else if(s.charAt(i)=='Y'||s.charAt(i)=='y') {
        		listY.add(i);
        	}
        }
        if(listP.size()==listY.size()) return true;
        else return false;
        
    }
}
public class Solution_PandY {
	public static void main(String[] args) {
        
	}
	
}
