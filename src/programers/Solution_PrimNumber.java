package programers;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution_PrimNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,5,6,4};
		System.out.println(solution(nums));
		ArrayList<Integer> e = new ArrayList<Integer>();
	}//1 2 3 4 5 6 7 8 9 10 11을 3개로 나눠바 2 4 5, 1 4 6
    public static int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        int num=3000;
        boolean[] arr = new boolean[num+1];    //true 이면 해당 인덱스 소수.
        arr[0] = arr[1] = false;
        for(int i=2; i<=num; i+=1) {
            arr[i] = true;
        }
 
        //2 부터 숫자를 키워가며 배수들을 제외(false 할당)
        for(int i=2; i*i<=num; i+=1) {
            for(int j=i*i; j<=num; j+=i) {
                arr[j] = false;        //2를 제외한 2의 배수 false
            }
        }
        HashSet<Integer> primNum = new HashSet<Integer>();
        for(int i=0 ; i<nums.length-2 ; i++) {
        	for(int j=i+1 ; j<nums.length-1 ; j++) {
        		for(int k=j+1 ; k<nums.length ; k++) {
        			temp = nums[i]+nums[j]+nums[k];
        			
        			if(arr[temp]) {
        				if(primNum.add(temp)) {
        					System.out.println(primNum.add(temp));
        					System.out.println(temp+","+answer);
        				}
        				else {
        					System.out.println(temp+","+answer);
        					answer++;
        					System.out.println(temp+","+answer);
        				}
        			}
        		}
        		
        	}
        }

        return answer+=primNum.size();
    }
	
	

}
