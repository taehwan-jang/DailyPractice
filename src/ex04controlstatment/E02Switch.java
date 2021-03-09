package ex04controlstatment;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int iNum = scanner.nextInt();
		System.out.println("입력하신 숫자는 : "+ iNum);
		
		int remain = iNum %3;
		
		switch(remain) {
		case 0:
			System.out.println("나머지가 0입니다.");
			break;
		case 1:
			System.out.println("나머지가 1입니다.");
			break;
		default :
			System.out.println("숫자가 아닙니다.");
		}
		
//		long ln = 100;
//		switch(ln) {
//		case 100:
//			System.out.println("long타입 사용?");
//		default :
//			System.out.println("안되는군!");
//		}
//		switch(iNum%3==0) {
//			Sytem.out.println("조건식, 논리식 안된다.")
//		}
		
		String title = "자바";
		switch(title) {
		case "자바":
			System.out.println("자바 조아");
			break;
		case "JAVA":
			System.out.println("JAVA JOA");
			break;
		}
		
		int season = 100;
		switch(season) {
		case 3:case 4:case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:case 7:case 8:case 9:
			System.out.println("여름 입니다.");
			break;
		case 10:
			System.out.println("가을 입니다.");
			break;
//		default:                      -> 생각해보니 111같은 숫자도 겨울로 표기됨; 
//			System.out.println("겨울 입니다."); 데이터를 명확하게 규정하는게 좋을듯
		case 11:case 12:case 1:
			System.out.println("겨울 입니다.");
			break;
		}
		
	}

}
