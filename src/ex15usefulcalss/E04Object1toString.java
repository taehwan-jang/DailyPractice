package ex15usefulcalss;

class MyFriends extends Object {
	
	String myName;
	public MyFriends(String name) {
		myName = name;
	}
	@Override
	public String toString() {
		return "이름: "+ myName;
	}
}
class YourFriends extends Object {
	String yourName;
	public YourFriends(String name) {
		yourName = name;
	}
}
public class E04Object1toString {

	public static void main(String[] args) {
		
		MyFriends fn1 = new MyFriends("장태바리");
		YourFriends fn2 = new YourFriends("바리바리");
		
		System.out.println(fn1);
		System.out.println(fn2);
		
	}
}
