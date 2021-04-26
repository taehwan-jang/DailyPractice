package programers;

public class Solution_Recursive {
	static int result=0;
	
    public int Solution_Recursive(int num) {
		System.out.println("재귀함수를 이용하여 팩토리얼 구하기");
		System.out.println("4!: "+factorial(4));
		System.out.println("10!: "+factorial(10));
		return num;
    }
	static int factorial(int num) {
		if(num==1) {
			return result;
		}
		else {
			if(num%2!=0) {
				factorial((num*3)+1);
				result++;
			}
			else {
				factorial(num/2);
				result++;
			}
		}
		if(result==500) return -1;
		return result;
	}
	
}
