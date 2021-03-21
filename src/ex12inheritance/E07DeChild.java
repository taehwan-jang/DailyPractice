package ex12inheritance;

public class E07DeChild extends E07DeParent {
	
	String stNumber;
	
	public E07DeChild(String name, int age, String stNumber) {
		super(name,age);
		this.stNumber = stNumber;
	}
	public void study() {
		System.out.println(getName()+"이(가) 공부한다.");
	}
	private void eat() {
		System.out.println("학생이 먹는다");
	}
	public String sleep() {
		System.out.println("학생이 잔다");
		return null;
	}
	public int walk(int age) {
		System.out.printf("나이가 %d인 학생이 산책한다.\n",age);
		return 0;
	}
	public void excecise() {
		System.out.println("학생이 운동한다.");
	}
	public void printParent() {
		super.printParent();
		System.out.printf(", 학번:%s\n",stNumber);
	}
	/*
	static메소드는 오버라이딩의 대상이 될 수 없다.
	클래스 외부에 존재하므로 오버라이딩 되지 않고
	호출할대는 각 클래스명을 통해 호출해야 한다.
	 */
	public static void staticMethod() {
		System.out.println("학생의 정적메소드");
		
	}
}
