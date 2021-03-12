package ex06array;
//예제와는 조금 다르게 씀;
public class E04CallByReference {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		System.out.println("[main]안 메소드 호출전");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("arr[%d]:%d\n",i,arr[i]);
			
		}
		callByReference(arr,10);
		
		System.out.println("[main] 메소드 호출후");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("arr[%d]:%d\n",i,arr[i]);
		}
	}
	static void callByReference(int[] arr2,int addVal) {
		
		for(int j=0 ; j<arr2.length ; j++) {
			arr2[j] += addVal;
		}
		System.out.println("[callByReference]안");
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.printf("arr2[%d]:%d\n",i,arr2[i]);
		}
	}

}
