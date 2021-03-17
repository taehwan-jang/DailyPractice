package ex10accessmodifier.cal;

public class Calculator {

	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int n1, int n2) {
		return adder.addTwoNumber(n1, n2);
	}
	
	public int subTwoNumber(int n1, int n2) {
		return subtractor.subTwoNumber(n1, n2);
	}
	
	public void showOperatingTimes() {
		System.out.println("덧셈횟수 : "+ adder.getaddCnt());
		System.out.println("뺄셈횟수 : "+ subtractor.getsubCnt());
	}
	
	
	
}
class Adder {
	
	private int addCnt;
	
	Adder(){
		addCnt=0;
	}
	
	public int getaddCnt() {
		return addCnt;
	}
	int addTwoNumber(int n1, int n2) {
		addCnt++;
		return n1+n2;
	}
	
}
class Subtractor {
	
	private int subCnt;
	
	Subtractor(){
		subCnt=0;
	}
	
	public int getsubCnt() {
		return subCnt;
	}
	int subTwoNumber(int n1, int n2) {
		subCnt++;
		return n1-n2;
	}
	
}