package ex08class;

class PersonConstructor {
	
	String name;
	int age;
	String addr;
	
	public PersonConstructor() {
		
		name = "이름없음";
		age = 0;
		addr = "미상";
		System.out.println("나는 기본생성자");
		
	}
	public PersonConstructor(String name) {
		
		this.name = name;
		age = 1;
		addr = "출처분명";
		
	}
	public PersonConstructor(String name,int age) {
		
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2]입니다.");
		
	}
	public PersonConstructor(String _name,int age,String addr) {
		
		name = _name;
		this.age = age;
		this.addr = addr;
		
	}
	void inintialize(String name,int age,String addr) {
		
		this.addr = name;
		this.age = age;
		this.addr = addr;
		
	}
	void showPersonInfo() {
		System.out.printf("%s님의 정보\n",this.name);
		System.out.printf("나이: %s\n",this.name);
		System.out.printf("주소: %s\n",this.addr);
	}
	
}


public class E05PersonConstructorMain {

	public static void main(String[] args) {

		PersonConstructor person1 = new PersonConstructor();
		
		System.out.println("[멤버변수 초기화용 메소드 호출전]");
		person1.showPersonInfo();
		
		System.out.println("[멤버변수 초기화용 메소드 호출후]");
		person1.inintialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		
		System.out.println("[이름만 전달]");
		PersonConstructor person2 = new PersonConstructor("장태환");
		person2.showPersonInfo();
		
		System.out.println("[이름과 나이 전달]");
		PersonConstructor person3 = new PersonConstructor("장태환",30);
		person3.showPersonInfo();
		
		System.out.println("[모든 매개변수 전달]");
		PersonConstructor person4 = new PersonConstructor("장태환",30,"부천");
		person4.showPersonInfo();
		
		PersonConstructor person5 = new PersonConstructor();
		person5.name = "장태환";
		person5.age = 10;
		person5.addr = "부천";
		person5.showPersonInfo();
		
		
	}

}
