 package ex05method;

import java.util.Scanner;

public class E07Overloading {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호를 입력:");
		int jNum = scanner.nextInt();
		System.out.print("군번을 입력");
		int mNum = scanner.nextInt();
		
		person(jNum,mNum);
		System.out.println("==========");
		person(jNum);
	}
	
	static void person(int jumin, int mil) {
		System.out.println("군필");
		System.out.println("주민번호:"+jumin);
		System.out.println("군번:"+mil);
	}
	static int person(int jumin) {
		System.out.println("미필이거나 여성");
		System.out.println("주민번호:"+jumin);
		return 1;
	}

}
