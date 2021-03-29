package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E04MultiCatch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int array[] = new int[3];
		
		try {
			for(int i=0 ; i<array.length ; i++) {
				System.out.println("array["+i+"]에 저장숫자 입력");
				array[i]=Integer.parseInt(scan.nextLine());
				
			}
			System.out.println("배열에 저장된 두 숫자 나누기"+
					array[0]/array[1]);
			System.out.print("나이를 입력하세요:");
			int age = scan.nextInt();
			System.out.println("당신의 나이는:"+age);
			
			array[3] = age;
			
		} 
		catch (InputMismatchException e) {
			System.out.println("숫자를 입력"); 
		}
		catch (ArithmeticException e) {
			System.out.println("0으로는 못나눈다");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 초과됨");
		}
		catch (Exception e) {
			System.out.println("위에거 다 아닌 예외");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("==끝==");
		
		
		
		
	}

}
