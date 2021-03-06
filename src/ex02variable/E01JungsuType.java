package ex02variable;

public class E01JungsuType {

	public static void main(String[] args) {

		int int1 = 100;
		int int2 = 200;
		int result1 = int1 + int2;
		System.out.println("int1 + int2 = "+ result1);
		
		result1 = int1 / int2; 
		System.out.println("int1 / int2 = "+ result1);
		
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;
		System.out.println("byte1 + byte2 = "+ result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short = "+ result3);
		
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 = "+result4);
		
		result4 = long1 + long2;
		System.out.println("long1 + long2 = "+ result4);

	}

}
