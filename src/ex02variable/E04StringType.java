package ex02variable;

public class E04StringType {

	public static void main(String[] args) {

		int number;
		number = 99;
		
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic + " " + plusString);
		
		int kor = 100, eng = 99, math = 98;
		System.out.println("총점 = " + kor + eng + math);
		System.out.println("총점 = " +(kor + eng + math));
		
		
	
	}

}
