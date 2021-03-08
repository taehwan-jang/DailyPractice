package doitjava;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dnum = 1.2;
		float fnum = 0.9F;
		
		int num1 = (int)dnum + (int)fnum;
		int num2 = (int)(dnum + fnum);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
