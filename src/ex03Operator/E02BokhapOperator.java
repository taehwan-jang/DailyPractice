package ex03Operator;

public class E02BokhapOperator {

	public static void main(String[] args) {

		double e = 2.71;
		e += 2.1;
		e *= 2;
		e = e + e;
		System.out.printf("e의 결과값 : %.2f %n", e);
		
		int n = 5;
//		n = n * 2.7;
		n *= 2.7;
		System.out.println("n의 결과값 : " + n);
	}

}
