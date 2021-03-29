package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
사용자정의 예외클래스
1.Exception클래스를 상속받는다.
2. 생성자에서 예외발생시 출력할 메시지를 super()를 통해 입력한다.
3. 예외 발생지점에서 if문으로 감지한 후 예외객체를 생성 및 thorw한다.
4. catch문에서 예외겍채를 받아 처리한다.
 */
class AgeErrorException2 extends Exception {
	public AgeErrorException2() {
		super("나이 똑바로 입력ㄱㄱ");
	}
}

public class E06DeveloperDefine2 {

	public static void main(String[] args) {

		System.out.print("나이를 입력ㄱ:");
		
		int age = readAge();
		System.out.println("당신의 나이는 "+age+"살 ");
	}
	public static int readAge() {
		Scanner scan = new Scanner(System.in);
		int inputAge = 0;
		try {
			//나이 입력시 문자를 입력하는 경우의 예외는 여기서 처리 가능
			inputAge = scan.nextInt();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		try {
		//나이가 음수값이 입력되면 개발자정의 예외객체를 생성한 후 throw한다.
			if(inputAge<0) {
				AgeErrorException2 er = new AgeErrorException2();
				throw er;/*
					throw하면 반드시 catch해야한다.
					그렇지않으면 프로그램이 종료된다.
				 */
			}
		}
		catch (AgeErrorException2 e) {
			System.out.println(e.getMessage());
		}
		return inputAge;
	}

}
