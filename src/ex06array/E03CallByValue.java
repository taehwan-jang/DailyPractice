package ex06array;

public class E03CallByValue {

	public static void main(String[] args) {

		int first=100, second=200;
		
		System.out.println("[main]메소드안-호출전\n"+
				"first:"+first+"\nsecond:"+second);
		callByValue(first,second);
		System.out.println("[main]메소드안-호출후\n"+
				"first:"+first+"\nsecond:"+second);
	
	}
	
	static void callByValue(int f, int s) {
		
		int temp;
		temp = f;
		f = s;
		s = temp;
		
		System.out.println("[callByValue]메소드안\n"+
				"first:"+f+"\nsecond:"+s);
	}

}
