package ex08class;

class Human {
	
	String name;
	int age;
	int energy;
	
	void walk() {
		energy--;
		if(energy<=0) {
			energy=0;
			System.out.println("[walk]에너지는 0이 최소");
			System.out.println("걸을 수 없어");
		}
		else {
			System.out.println("[walk]에너지가 1감소");
		}
	}
	void thinking() {
		energy-=2;
		if(energy<=0) {
			energy=0;
			System.out.println("[thinking]에너지는 0이 최소");
			System.out.println("생각할 수 없어");
		}
		else {
			System.out.println("[thinking]에너지가 2감소");
		}
	}
	void eat() {
		energy+=2;
		if(energy>=10) {
			energy=10;
			System.out.println("[eat]에너지는 10이 최대");
			System.out.println("먹을 수 없어");
		}
		else {
			System.out.println("[eat]에너지가 2증가");
		}
	}
	void showState() {
		System.out.println("==현재상태==");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("에너지: "+energy);
		System.out.println("==현재상태==");
	}
	
	
}
public class E02HumanMain {

	public static void main(String[] args) {

		Human human = new Human();
		
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
		human.showState();
		human.eat();
		human.walk();
		human.thinking();
		human.showState();
		
		for(int i=1 ; i<=10 ; i++) {
			human.walk();
		}
		human.showState();
		for(int i=1 ; i<=10 ; i++) {
			human.eat();
		}
		human.showState();
		
	}

}
