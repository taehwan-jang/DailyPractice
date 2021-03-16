package ex08class;
class Account {
	
	String name;
	String accountNumber;
	int balance;
	
	void deposit(int money) {
		balance += money;
		System.out.println(money+"원이 입금됨");
		System.out.println("현재 잔고"+balance+"원");
	}
	
	void withdraw(int money) {
		
		if(balance>=money) {
			balance-=money;
			System.out.println(money+"원이 출금됨");
			System.out.println("현재 잔고"+balance+"원");
			
		}
		else {
			System.out.println("잔고부족으로 출금불가");
		}
	}
	void showAccount() {
		System.out.println("계좌주: "+name);
		System.out.println("계좌번호: "+accountNumber);
		System.out.println("잔고: "+balance);
	}
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
	
}


public class E04AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		account.init("장동건", "111-21-8888", 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		Account account2 = new Account();
		account2.name ="정우성";
		account2.accountNumber ="123-45-789462";
		account2.balance =900000;
		account2.showAccount();
		
		
	}

}
