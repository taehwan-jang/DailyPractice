package ex16exception;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class E02PreDefineException {
	
	static Date toDay; 

	public static void main(String[] args) {

		System.out.println("==ArrayIndexOutOfBoundsException==");
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은 : "+ intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은 : "+ intArr[0]);
			
			intArr[2] = 300;// 여기서 인덱스 에러 발생
			System.out.println("인덱스 에러발생:intArr[2]:"+intArr[2]);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생");
			System.out.println("예외메세지"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("0번방 재출력:"+intArr[0]);
		System.out.println("==ArrayIndexOutOfBoundsException발생후==");
		////////////////////////////////////////////////////////////
		System.out.println("==NumberFormatException==");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("나이를 입력: ");
			String strAge = scan.nextLine();
			int ageAfter10 = Integer.parseInt(strAge)+10;
			System.out.println("당신의 10년후 나이는:"+ageAfter10); 
			
		} catch (NumberFormatException e) {
			System.out.println("나이는 숫자로 입력해라");
			System.out.println("예외메세지:"+e.getMessage());
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////////
		System.out.println("==NullPointerException==");
		System.out.println("toDay="+toDay);
		try {
			System.out.println(toDay.getTime());
		} 
		catch (NullPointerException e) {
			System.out.println("toDay의 참조변수는 Null임(객체생성X)");
			System.out.println("예외메세지:"+e.getMessage());
		} 
		System.out.println("==ArithMetticException=="); 
		int result = 10;
		try {
			result = result/0 ; 
			System.out.println("결과는:"+result);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없지");
			System.out.println("계산불가예외발생"+e.getMessage());
			e.printStackTrace();
		}
		///////////////////////////////////////////////////////////
		System.out.println("==ClassCastException==");
		Object obj = new Object();
		try {
			String strObject = (String)obj;
		} catch (ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		String str = "형변환 ㅇㅋ?";
		boolean castFlag = myClassCasting(str);
		if(castFlag) {
			System.out.println("ㅇㅋ");
		}
		else {
			System.out.println("ㄴㄴ");
		}
		

		
		
	}
	public static boolean myClassCasting(Object o) {
		if(o instanceof String) {
			return true;
		}
		else {
			return false;
		}
	}

}
