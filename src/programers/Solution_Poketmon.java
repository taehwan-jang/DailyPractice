package programers;

import java.util.HashSet;

public class Solution_Poketmon {

    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> temp = new HashSet<Integer>();
        for(int i=0 ; i<nums.length ; i++) {
        	temp.add(nums[i]);
        }
        return temp.size()>nums.length/2? nums.length/2:temp.size();
    }
    public static void main(String[] args) {
		
	}
}

