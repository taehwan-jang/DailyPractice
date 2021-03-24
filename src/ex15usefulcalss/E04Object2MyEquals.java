package ex15usefulcalss;

class IntNumber {
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	public boolean myEquals(IntNumber numObj) {
		if(this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class E04Object2MyEquals {
	
	public static void main(String[] args) {
		
		String str1 = new String("우린 KOSMO");
		String str2 = new String("우린 KOSMO");
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다");
		}
		else {
			System.out.println("다른 문자열입니다");
		}
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.myEquals(num2)) {
			System.out.println("num1과 num2는 같음"); 
		}
		else {
			System.out.println("num1과 num2는 다름");
		}
		if(num1.myEquals(num3)) {
			System.out.println("num1과 num3는 같음"); 
		}
		else {
			System.out.println("num1과 num3는 다름");
		}
		
		
	}

}
