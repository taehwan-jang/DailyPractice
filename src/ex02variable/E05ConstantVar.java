package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {

		final double PI = 3.14;
		System.out.println("PI(원주율) = " + PI);
		
//		PI = 3.141592;
		
		final String NICK_NAME;
//		System.out.println("우리는 " + NICK_NAME);
		NICK_NAME = "코스모 82기";	
		System.out.println("우리는 " + NICK_NAME);
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int computer, user;
		
		computer = 1; // 이건 왜 대입을 연속으로 못하는지 ? int 선언했고 computer = 1, user = 2; 
		user = 3;
		System.out.println("컴퓨터가 이겼습니다.");
		
		computer = SCISSOR;
		user = ROCK;
		System.out.println("user win");
		
	}

}
