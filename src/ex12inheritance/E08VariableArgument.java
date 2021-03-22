package ex12inheritance;

public class E08VariableArgument {
	
	static int getTotal(int param) {
		int total = 0;
		total += param;
		return total;
	}
	static int getTotal(int param,int param2) {
		int total = 0;
		total += (param+param2);
		return total;
	}
	static int getTotal(int param,int param2,int param3) {
		int total = 0;
		total += (param+param2+param3);
		return total;
	}
	static int getTotal(int param,int param2,int param3,int param4) {
		int total = 0;
		total += (param+param2+param3+param4);
		return total;
	}
	static int getParam(int ... param) {
		int total = 0;
		for(int i=0 ; i<param.length ; i++) {
			total += param[i];
		}
		return total;
	}

	public static void main(String[] args) {

		
		System.out.println("10호출:"+getTotal(10));
		System.out.println("10,20호출:"+getTotal(10,20));
		System.out.println("10,20,30호출:"+getTotal(10,20,30));
		System.out.println("10,20,30,40호출:"+getTotal(10,20,30,40));
	
		System.out.println("getParam이용 10~90출력:"+getParam(10,20,30,40,50,60,70,80,90));
		;
		
	}

}
