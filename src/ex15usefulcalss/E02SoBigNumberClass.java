package ex15usefulcalss;

import java.math.BigDecimal;
import java.math.BigInteger;

public class E02SoBigNumberClass {

	public static void main(String[] args) {
		
		System.out.println("Long형 최대값:"+Long.MAX_VALUE);
		System.out.println("Long형 최소값:"+Long.MIN_VALUE);
		
		BigInteger bigValue1 = new BigInteger("100000000000");
		BigInteger bigValue2 = new BigInteger("-100000000000");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger subResult = bigValue1.subtract(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		BigInteger divResult = bigValue1.divide(bigValue2);
		BigInteger remResult = bigValue1.remainder(bigValue2);
		
		System.out.println("큰수덧셈="+addResult);
		System.out.println("큰수뺄셈="+subResult);
		System.out.println("큰수곱셈="+mulResult);
		System.out.println("큰수나눗셈="+divResult);
		System.out.println("큰수나머지="+remResult);
		
		double dbl1 = 1.6;
		double dbl2 = 0.1;
		
		System.out.println("두 실수의 덧셈(오차o):"+(dbl1+dbl2));
		System.out.println("두 실수의 덧셈(오차o):"+(dbl1+dbl2));
		
		BigDecimal bigDec1 = new BigDecimal("1.6");
		BigDecimal bigDec2 = new BigDecimal("0.1");
		
		System.out.println(bigDec1.add(bigDec2));
		System.out.println(bigDec1.subtract(bigDec2));
		System.out.println(bigDec1.multiply(bigDec2));
		System.out.println(bigDec1.divide(bigDec2));
		System.out.println(bigDec1.remainder(bigDec2));
		
		
		
		
		
		
		
		
	}
}
