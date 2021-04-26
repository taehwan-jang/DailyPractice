package programers;

public class Solution_isPrim {

	public static void main(String[] args) {
		int num=100;
        int answer =0;
        boolean[] arr = new boolean[num+1];   
        arr[0] = arr[1] = false;
        for(int i=2; i<=num; i+=1) {
            arr[i] = true;
        }
 

        for(int i=2; i*i<=num; i+=1) {
            for(int j=i*i; j<=num; j+=i) {
                arr[j] = false;      
            }
        }
        for(int k=0 ; k<=100 ; k++){
            if(arr[k]){
                answer++;
            }
        }

	}

}
