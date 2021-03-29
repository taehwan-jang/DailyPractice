package ex16exception;

import java.io.IOException;

public class E03ExceptionCase3 {

	static void compileFunc() throws IOException{
		try {
			
			System.out.print("하나의 문자를 입력하세요:");
			int userChar = System.in.read();
			System.out.println("입력된 문자는:"+(char)userChar);
			int result = 10/0;
			
		} 
		finally {
			System.out.println("예외와 상관없이 실행되는 finally");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			compileFunc();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("==end==");
		
		

	}

}
