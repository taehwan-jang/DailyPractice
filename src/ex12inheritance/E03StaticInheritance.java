package ex12inheritance;

class Adder {
	public static int val = 0;
	
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

class AdderFriend extends Adder {
	public void friendAdd(int num) {
		val += num;
		Adder.val += num;
	}
	public void showVal() {
		System.out.println("val= "+ val);
		System.out.println("Adder.val= "+ Adder.val);
	}
}

public class E03StaticInheritance {

	public static void main(String[] args) {

		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);
		adFriend.friendAdd(3);
		Adder.val += 5;
		AdderFriend.val += 7;
		
		adFriend.showVal();
	}
}
