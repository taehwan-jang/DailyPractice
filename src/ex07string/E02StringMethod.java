package ex07string;

public class E02StringMethod {

	public static void main(String[] args) {

		System.out.println("[String 클래스의 주요메소드]");
		String str1 = "Welcome to JAVA";
		String str2 = "자바야 놀자!";
		
		System.out.println("str1의 길이 : "+str1.length());
		System.out.println("str2의 길이 : "+str2.length());
		
		System.out.println("str1의 두번째 문자 : "+str1.charAt(1));
		System.out.println("str2의 두번째 문자 : "+str2.charAt(1));
		
		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는 프로그램을 작성
		
		190413-3000000
		190413-4000000
		 */
		
		String juminNum = "190413-3000000";
//		juminNum.charAt(7)=='3' charAt을 사용했기때문에 반환타입이 ''이므로
//		==3 주의해라 =='3'이다
		if(juminNum.charAt(7)=='3' || juminNum.charAt(7)=='1') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7)=='2' || juminNum.charAt(7)=='4'){
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7)=='5' || juminNum.charAt(7)=='6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("잘못된 주민번호입니다.");
		}
		String  str3 = "A";
		String  str4 = "B";
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str3));
		System.out.println("ABC".compareTo("ABC")==0?
				"문자열이 같다":"문자열이 다르다");
		
		System.out.println("JAVA".concat(" WORLD").concat(" GO"));
		System.out.println("JAVA"+" WORLD"+" GO");
		
		System.out.println(str1.contains("TO"));
		System.out.println(str1.contains("to"));
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는 프로그램을 작성하시오.
		hong@ikosmo.co.kr
		not@naver
		 */
		String email1 = new String("hong@ikosmo.co.kr");
		String email2 = "not@naver";
		
		if(email1.contains("@")&&email1.contains(".")) {
			System.out.println("이메일 형식이 맞습니다.");
		}
		else {
			System.out.println("이메일 형식이 아닙니다.");
		}
		
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n",80,91,100);
		String formatStr = String.format("국어:%d, 영어:%d, 수학:%d\n",
				80,91,100);
		System.out.println(formatStr);
		
		System.out.println(str1.indexOf("AVA"));
		System.out.println(str1.indexOf("ava"));
		System.out.println(str1.indexOf("J"));
		System.out.println(str1.indexOf("j"));
		System.out.println(email1.indexOf("@")!=-1?
				"이메일형식맞음":"이메일형식아님");
		/*
		시나리오] 주민등록번호를 indexOf를 사용하여 성별을 구분하는
		프로그램을 작성하시오.
		 */
		
		String jumin = "123456-7891234";
//		if(jumin.indexOf(7)==1 || jumin.indexOf(7)==3) {
//			System.out.println("남성입니다.");
//		}
//		else if(jumin.indexOf(7)==2 || jumin.indexOf(7)==4) {
//			System.out.println("여성입니다.");
//		}
//		else if(jumin.indexOf(7)==5 || jumin.indexOf(7)==6) {
//			System.out.println("외국인입니다.");
//		}
//		else {
//			System.out.println("잘못된 주민번호입니다.");
//		}
		int index = jumin.indexOf("-")+1;
		if(jumin.charAt(index)=='1'||jumin.charAt(index)=='3') {
			System.out.println("남성입니다.");
		}
		else {
			System.out.println("여성입니다.");
		}
		
		System.out.println(str1.lastIndexOf("AVA"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf: "+str1.indexOf("A"));
		System.out.println("lastIndexOf: "+str1.lastIndexOf("A"));
		
		System.out.println("[J를 G로 변경하기]");
		System.out.println(str1.replace("J", "G"));
		System.out.println("[Java를 KOSMO로 변경하기]");
		System.out.println(str1.replace("JAVA", "KOSMO"));
		System.out.println("[데이터를 바꾸진않음 foreach와 같이]");
		System.out.println(str1);
		
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.println(phoneArr[i]);
		}
		
		phoneArr = phoneNumber.split("$");
		for(String num : phoneArr) {
			System.out.println(num);
		}
		
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오.
		파일명 : my.file.images.jpg
		 */
		
		String filename = "my.file.images.jpg";
		int beginindex = filename.lastIndexOf(".")+1;
		System.out.println("파일확장자: "+
		filename.substring(beginindex));
	}
}
