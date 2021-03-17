package ex08class;

class FruitSeller{
	
	int numOfApple =100;
	int myMoney = 0;
	final int APPLE_PRICE =1000;
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showsaleResult() {
		System.out.println("[판매자]남은 사과갯수: "+numOfApple);
		System.out.println("[판매자]판매 수익: "+myMoney);
	}
}
class FruitBuyer{
	
	int numOfApple = 0;
	int myMoney = 10000;
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showsaleResult() {
		System.out.println("[구매자]현재 잔액: "+myMoney);
		System.out.println("[구매자]사과 갯수: "+numOfApple);
	}
}


public class E06FruitSalesMain1 {

	public static void main(String[] args) {

		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("[구매행위가 일어나기 전]");
		
		seller.showsaleResult();
		buyer.showsaleResult();
		
		buyer.buyApple(seller, 5000);
		
		System.out.println("[구매행위가 일어난 후]");
		seller.showsaleResult();
		buyer.showsaleResult();
	}
}
