package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 똑바로 입력해 새캬");
	}
}


public class E06DeveloperDefine {

	public static void main(String[] args) {
		
		System.out.print("나이 입력ㄱ:");
		
		try {
			int age = readAge();
			System.out.println("나이는"+age+"살");
		} catch (AgeErrorException e) {
			System.out.println("[예외발생]"+e.getMessage());
		}

	}
	static int readAge() throws AgeErrorException {
		Scanner scan = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = scan.nextInt();
		} 
		catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		if(inputAge<0) {
			AgeErrorException er = new AgeErrorException();
			throw er;
		}
		return inputAge;
	}

}
