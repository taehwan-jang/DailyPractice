package ex06array;

public class E07ForEachObject {

	public static void main(String[] args) {
		//어레이 초기화하는거 다시 공부해봐 종류 많으니까
		String[] strArr = new String[] {
				"자바 재미",
				"자바 유용",
				"자바 어렵"
		};
		
		for(String a : strArr) {
			System.out.println(a);
		}
	}
}
