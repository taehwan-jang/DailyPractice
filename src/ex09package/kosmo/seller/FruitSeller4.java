package ex09package.kosmo.seller;

public class FruitSeller4 {
	
	//멤버변수와 상수를 선언
	int numOfApple;//판매자의 사과보유 갯수
	int myMoney; //판매자 판매수익
	final int APPLE_PRICE;//(컨트롤쉬프트x 대문자 y 소문자)
	
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재상태
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과갯수: "+numOfApple);
		System.out.println("[판매자]판매 수익: "+myMoney);
	}
	
}