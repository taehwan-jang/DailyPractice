package ex12inheritance;

public class E07RideAndLoad02 {

	public static void main(String[] args) {

		System.out.println("Child형 참조변수로 child객체 참조");
		E07DeChild child = new E07DeChild("A", 30, "13학번");
		
		child.excecise();
		child.sleep();
		child.printParent();
		
		child.study();
		child.walk();
		child.walk(30);
		
		E07DeChild.staticMethod();
		
		System.out.println("Parent형 참조변수로 Child객체 참조");
		E07DeParent parent = new E07DeChild("B", 29, "14학번");
		
		parent.excecise();
		parent.sleep();
		
//		parent.study();
		parent.walk();
//		parent.walk(20);
		
		E07DeParent.staticMethod();
		
	}

}
