package ex16exception;

import java.io.IOException;

public class E03ExceptionCase1 {

	static void compileFunc() throws IOException{
		System.out.print("하나의 문자를 입력하세요:");
		int userChar = System.in.read();
		System.out.println("입력된 문자는:"+(char)userChar);
		
	}
	
	public static void main(String[] args) throws IOException{
		
		compileFunc();
		
		//예외를 그냥 싹다 외부로 던져버리는거임
		

	}

}
