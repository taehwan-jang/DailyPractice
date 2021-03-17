package ex08class;

class FruitSeller3 {
	
	int numOfApple;
	int myMoney;
	int APPLE_PRINCE;
	
	public FruitSeller3(int money, int appleNum, int price) {
		
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRINCE = price;
		
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRINCE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]판매 수익: "+myMoney);
		System.out.println("[판매자]남은 사과: "+numOfApple);
	}
	
}

class FruitBuyer3 {
	
	int numOfApple;
	int myMoney;
	
	public FruitBuyer3(int money, int appleNum) {
		
		myMoney = money;
		numOfApple = appleNum;
		
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showSaleResult() {
		System.out.println("[구매자]현재 잔액: "+myMoney);
		System.out.println("[구매자]보유 사과: "+numOfApple);
	}
	
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {

		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		FruitSeller3 seller2 = new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
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
