package ex07string;

public class E03StringBuilderBuffer {

	public static void main(String[] args) {

		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append('Y').append(true);
		System.out.println("strBuff: "+strBuf);
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuff: "+strBuf);
		
		System.out.println("[String과 StringBuffer의 참조값 비교]");
		String str1 = "KOSMO";
		String str2 = "KOSMO";
		
		if(str1==str2) {
			System.out.println("참조값 같음");
		}
		else {
			System.out.println("참조값 다름");
		}	
		
		System.out.println("[str1에 \"EDUCATION\" 연결]");
		str1 = str1+"EDUCATION";
		if(str1==str2) {
			System.out.println("연결후 참조값 같음");
		}
		else {
			System.out.println("연결후 참조값 다름");
		}
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf: "+buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본 버퍼크기: "+buf.capacity());
		
		buf.append("KOSMO");
		System.out.println("buf: "+buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본 버퍼크기: "+buf.capacity());
		
		buf.append(" 금일은 StringBuffer 수업 ").append("오늘은 월요일");
		System.out.println("buf: "+buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("추가된 버퍼크기: "+buf.capacity());
		
		
			
			
			
			
	}
}
