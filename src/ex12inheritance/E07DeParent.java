package ex12inheritance;

public class E07DeParent {

	private String name;
	private int age;
	
	public E07DeParent() {}
	public E07DeParent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	private void eat() {
		System.out.println("부모님이 식사하신다.");
		System.out.println("위는 private Method");
	}
	String sleep() {
		System.out.println("부모님이 주무신다.");
		System.out.println("위는 default Method");
		return null;
	}
	protected void walk() {
		System.out.println("부모님이 산책하신다.");
		System.out.println("위는 protected Method");
	}
	public void excecise() {
		System.out.println("부모님이 운동하신다.");
		System.out.println("위는 public Method");
	}
	public void printParent() {
		System.out.printf("성함:%s, 나이:%d\n",name,age);
	}
	public static void staticMethod() {
		System.out.println("부모님의 정적메소드");
	}
	
	
}
