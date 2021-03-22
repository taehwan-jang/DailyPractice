package ex12inheritance;

class Parent {
	int parentMember;
	void parentMethod() {
		System.out.println("부모메소드");
	}
}
class Child extends Parent {
	int childMember;
	void childMethod() {
		System.out.println("자식메소드");
	}
	@Override
	void parentMethod() {
		System.out.println("자식이 오버라이딩함");
	}
	void parentMethod(int num) {
		childMember = num;
		System.out.println("자식이 오버로딩함");
	}
}

public class E11Polymorphism {

	public static void main(String[] args) {

		Child homeChild = new Child();
		
		homeChild.childMember=10;
		homeChild.parentMember=1000;
		homeChild.childMethod();
		homeChild.parentMethod();
		homeChild.parentMethod(100);
		
		System.out.println("부모타입에 자식타입의 메모리 참조");
		
		Parent parent1 = homeChild;
		parent1.parentMember = 1;
		parent1.parentMethod();
		
		//위랑 똑같이 두개밖에 참조 못함ㅋ 병신ㅋ
		Parent parent2 = new Child();
		parent2.parentMember = 1;
		parent2.parentMethod();
		
		((Child)parent2).childMember =1;
		((Child)parent2).childMethod();
		((Child)parent2).parentMethod(1);
		((Child)parent2).parentMethod();
		
		Child child2 = (Child)parent2;
		child2.childMember =1;
		child2.childMethod();
		child2.parentMethod();
		child2.parentMethod(10);
		
		Object object = new Child();
		((Parent)object).parentMethod();
	}

}
