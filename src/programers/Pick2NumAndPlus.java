package programers;
/*
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 
만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	numbers의 길이는 2 이상 100 이하입니다.

    numbers의 모든 수는 0 이상 100 이하입니다.
    
    
입출력 예
numbers 		result
[2,1,3,4,1] 	[2,3,4,5,6,7]
[5,0,2,7] 		[2,5,7,9,12]
    
    
    2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
    3 = 2 + 1 입니다.
    4 = 1 + 3 입니다.
    5 = 1 + 4 = 2 + 3 입니다.
    6 = 2 + 4 입니다.
    7 = 3 + 4 입니다.
    따라서 [2,3,4,5,6,7] 을 return 해야 합니다.


    2 = 0 + 2 입니다.
    5 = 5 + 0 입니다.
    7 = 0 + 7 = 5 + 2 입니다.
    9 = 2 + 7 입니다.
    12 = 5 + 7 입니다.
    따라서 [2,5,7,9,12] 를 return 해야 합니다.


 */
public class Pick2NumAndPlus {
	
	static int[] arr;
	static int length;
	static int[] addArr2;
    public int nCr(int n, int r){//nCr 표현하는 메소드 직접 구현해볼것. 더불어 출력까지
		length= 1;
		for(int i=1; i<=r; i++) {
			length = length*(n-i+1)/i;
		}
		return length;
	}
	public Pick2NumAndPlus(int[] arrNum) {//arr이 지역변수임.
		addArr2=new int[nCr(arrNum.length,2)];
		arr = arrNum;
		addArr(arr);
	}
	//두개를 뽑아서 더하는 메소드
	public void addArr(int[] arr) {
		//구구단
		int a=0;
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=1 ; j<arr.length ; j++) {
				if(i>=j) {
				}
				else{
					addArr2[a]=arr[i] + arr[j];
					a++;
				}
			}
		}
	}
	//중복 제거 후 더한 arr 출력하는 메소드
	//중복제거는 switch문 활용? 앞에서부터하면 -> 내림차순이 됨;
	static void printArr(Pick2NumAndPlus num) {
		System.out.print("{ ");
		for(int i=0 ; i<num.addArr2.length ; i++) {
			if(num.addArr2[i]==0) {
			}
			else{
				System.out.print(num.addArr2[i]+" ");
			}
		}
		System.out.print("}");
	}
	public static void main(String[] args) {
		int[] arr2 = {1,2,30,5,44,8};
		Pick2NumAndPlus num = new Pick2NumAndPlus(arr2);
		printArr(num);
	}
	//Recursive Method 활용해야하는지??
}
