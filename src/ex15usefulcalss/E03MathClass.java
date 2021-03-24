package ex15usefulcalss;

public class E03MathClass {

	public static void main(String[] args) {
		
		float f = -3.14f;
		double d = -100.9;
		int num = -100;
		
		System.out.println("==절대값==");
		System.out.println("Math.abs: "+Math.abs(f));
		System.out.println("Math.abs: "+Math.abs(d));
		System.out.println("Math.abs: "+Math.abs(num));
		
		System.out.println("==올림==");
		System.out.println("Math.ceil: "+Math.ceil(3.4));
		System.out.println("Math.ceil: "+Math.ceil(-3.4));
		System.out.println("Math.ceil: "+Math.ceil(3.9));
		
		System.out.println("==내림==");
		System.out.println("Math.floor: "+Math.floor(3.4));
		System.out.println("Math.floor: "+Math.floor(-3.4));
		System.out.println("Math.floor: "+Math.floor(3.9));
		
		//반올림 : 무조건 소수점 첫째자리에서 반올림 처리한다.
		System.out.println("==반올림==");
		System.out.println("Math.round: "+Math.round(3.4999));
		System.out.println("Math.round: "+Math.round(3.5111));
		System.out.println("Math.round: "+Math.round(-1.4));
		System.out.println("Math.round: "+Math.round(-1.5));
		System.out.println("Math.round: "+Math.round(-3.51));
		
		System.out.println("==최대/최소==");
		System.out.println("Math.max: "+Math.max(100, 90));
		System.out.println("Math.min: "+Math.min(100, 90));
		
		System.out.println("==난수==");
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("==거듭제곱==");
		System.out.println("2의 10승: "+Math.pow(2, 10));
		
		
		
	}
}
