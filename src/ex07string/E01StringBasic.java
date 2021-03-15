package ex07string;

public class E01StringBasic {

	public static void main(String[] args) {

		int num1=10, num2=20;
		String numResult = (num1==num2)? "데이터 같다":
			"데이터다르다";
		System.out.println("비교결과: "+ numResult);
		
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}
		else {
			System.out.println("두 문자열은 동일하지않다");
		}
		
		String str3 = "KOSMO";
		String str4 = "KOSMO";
		
		System.out.println("equals()메소드로 문자열비교: "+
		str3.equals(str4));
		
		if(str3==str4) {
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
	}
}
