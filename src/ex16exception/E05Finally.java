package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E05Finally {

	static void runtime() throws NumberFormatException{
		Integer.parseInt("백");
	}
	static void tryCatchFinally() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력:");
		int age = Integer.MAX_VALUE;
		
		try {
			age = scan.nextInt();
			System.out.println("당신의 5년후 나이는:"+(age+5)+"살임");
			return;
		} 
		catch (InputMismatchException e) {
			System.out.println("숫자만 입력해");
		}
		finally {
			System.out.println("늘 실행되는 finally");
			System.exit(0);//try문 안에서 프로그램 종료 메소드
		}
	}
	public static void main(String[] args) {

		try {
			runtime();
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		tryCatchFinally();
		//finally절에서 exit(0)이 실행되므로 아래는 실행x
		System.out.println("메인메소드 끝");
	}

}
