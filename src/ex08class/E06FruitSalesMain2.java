package ex08class;

class FruitSeller2 {
	
	int numOfApple;
	int myMoney;
	int apple_prince;
	
	public void initialize(int money, int appleNum, int price) {
		
		myMoney = money;
		numOfApple = appleNum;
		apple_prince = price;
		
	}
	
	public int saleApple(int money) {
		int num = money / apple_prince;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]판매 수익: "+myMoney);
		System.out.println("[판매자]남은 사과: "+numOfApple);
	}
	
}

class FruitBuyer2 {
	
	int numOfApple;
	int myMoney;
	
	public void initialize(int money, int appleNum) {
		
		myMoney = money;
		numOfApple = appleNum;
		
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showSaleResult() {
		System.out.println("[구매자]현재 잔액: "+myMoney);
		System.out.println("[구매자]보유 사과: "+numOfApple);
	}
	
}

public class E06FruitSalesMain2 {

	public static void main(String[] args) {

		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initialize(0, 100, 1000);
		
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initialize(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initialize(10000, 0);
		
		System.out.println("[구매행위가 일어나기 전]");
		
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showSaleResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("[구매행위가 일어난 후]");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showSaleResult();
		
	
	}

}
