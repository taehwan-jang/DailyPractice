package ex16exception;

import java.io.IOException;

public class E03ExceptionCase2 {

	static void compileFunc() {
		try {
			System.out.print("하나의 문자를 입력하세요: ");
			int userChar = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		compileFunc();
		
		
	}

}
