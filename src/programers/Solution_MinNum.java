package programers;
import java.util.ArrayList;

public class Solution_MinNum {

	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] answer = new int[arr.length-1];
		int index=0;
		int a=10;
		if(arr.length==1){
			arr[0]=-1;
			return answer=arr;
		}
		for(int i=0 ; i<arr.length ; i++){
			list.add(arr[i]);
			if(a>arr[i]){
				a=arr[i];
				index=i;
			}
		}
		System.out.println(index);
		list.remove(index);
		for(int c:list) {
			System.out.print(c+" ");
		}
		System.out.println();
		int b=0;
		for(int c:list) {
			answer[b++]=c;
			System.out.print(answer[b-1]+" ");
		}

		return answer;
	}
	public static void main(String[] args) {

		int[] arr = {4,3,2,1};
		solution(arr);
		
	}

}
