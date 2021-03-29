package ex16exception;

import java.io.IOException;

public class E01ExceptionBasic {

	public static void main(String[] args) {

		int number1 = 10;
		if(true) {
			System.out.println();
		}
		else {
			System.out.println("거짓이다");
		}
		System.out.println("문자 하나를 입력하세요: ");
		try {
			int iChar = System.in.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
