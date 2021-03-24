package ex15usefulcalss;

public class E01WrapperClass2 {

	public static void main(String[] args) {

		String strNumber = "1000";
		System.out.println("10+strNumber="+(10+strNumber));
		System.out.println("10+strNumber를 숫자로 변환: "+
				(10+Integer.parseInt(strNumber)));
		
		
		String money = "1200원";
//		System.out.println("1200원="+Integer.parseInt(money));
//		'원'은 숫자가 아니니까 에러가 생기지 
		
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString));
//		이것도 에러 발생하지
		System.out.println("실수형(float)형으로 변환:"+
				Float.parseFloat(floatString));
		System.out.println("실수형(double)형으로 변환:"+
				Double.parseDouble(floatString));
		
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		System.out.println("isDigit()을 이용한 숫자판단");
		System.out.println(Character.isDigit('a')?"숫자":"숫자아님");
		System.out.println(Character.isDigit(50)?"숫자":"숫자아님");
		System.out.println(Character.isDigit('5')?"숫자":"숫자아님");
		
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		System.out.println("isWhitespace()메소드를 통한 공백문자판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isLowerCase('가'));
		
		/*
		시나리오]
		주어진 문자열 안에 몇개의 공백문자(스페이스)가 있는지 판단하는
		프로그램을 작성하시오
			참고) toCharArray() : 문자열 char형으로 배열을 반환해주는
			String클래스에 정의된 메소드.
		 */
		String text = "down down down down round round ";
		int whitecount = 0;
		char[] chArr = text.toCharArray();
		for(int i=0 ; i<chArr.length ; i++) {
			if(Character.isWhitespace(chArr[i])) {
				whitecount++;
			}
		}
		System.out.println("공백= "+whitecount);
		
	}

}
