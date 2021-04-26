package programers;

public class Solution_pow {
	
	public static void main(String[] args) {
		
		System.out.println(Math.pow(16, 0.5));
		
		if(Math.pow(16,0.5)%1!=0) {
			System.out.println(-1);
		}
		else {
			System.out.println(Math.pow(Math.pow(16,0.5)+1, 2));
		}
		
	}
}
//class Solution {
//    public long solution(long n) {
//        long answer = 0;
//        
//        System.out.println(Math.pow(n, 0.5));
//        
//        
//        return answer;
//    }
//}