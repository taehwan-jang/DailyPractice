package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int[] ref;
		System.out.println("초기화 직후 출력");
		for(int i=0 ; i <arr.length ; i++) {
			System.out.printf("arr[%d]: %d\n",i,arr[i]);
		}
		System.out.println("arr참조값(주소값):"+ arr);
//		System.out.println("ref참조값(주소값):"+ ref);
//		에러발생 ref는 아직 초기화하기 전이므로 참조값을 부여받지 못함
		System.out.println("===========");
		
		ref = addAllArray(arr,7);
		
		System.out.println("메소드 호출 후 출력");
		for(int i=0; i<ref.length ; i++) {
			System.out.printf("ref[%d]: %d\n",i,ref[i]);
		}
		System.out.println();
		for(int i=0 ; i <arr.length ; i++) {
			System.out.printf("arr[%d]: %d\n",i,arr[i]);
		}
	}
	static int[] addAllArray(int[] ar,int a) {
		for(int i=0 ; i<ar.length ; i++) {
			ar[i] += a;
		}
		return ar;
	}

}
