package ex10accessmodifier;

//과일판매자로 추상화한 클래스
class FruitSeller6 {
	
	//외부클래스에서 접근할 수 없도록 private으로 선언한다.
	private int numOfApple;//판매자의 사과보유 갯수
	private int myMoney; //판매자 판매수익
	private final int APPLE_PRICE;//(컨트롤쉬프트x 대문자 y 소문자)
	
	public FruitSeller6(int money, int appleNum, int price) {
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
//구매자를 표현한 클래스
class FruitBuyer6 {
	
	private int myMoney;//보유금액
	private int numOfApple;//구매한 사과의 갯수
	
	//멤버변수 초기화를 위한 생성자메소드
	public FruitBuyer6(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller6 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재 잔액: "+ myMoney);
		System.out.println("[구매자]사과 갯수: "+ numOfApple);
	}
	
}
public class E03InformationHiding {

	public static void main(String[] args) {

		
		//판매자1 : 사과갯수 100개 단가 1000원
		FruitSeller6 seller1 = new FruitSeller6(0,100,1000);
		
		//판매자2 : 사과갯수 80개 단가 500원
		FruitSeller6 seller2 = new FruitSeller6(0,80,500);
		
		//구매자 : 보유금액 10000원
		FruitBuyer6 buyer = new FruitBuyer6(10000,0);
		
		System.out.println("[구매행위가 일어나기전의 상태]");
		
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1,	5000);
		buyer.buyApple(seller2,	5000);
		
		System.out.println("[구매행위가 일어난 후 상태]");
		
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		/*
		멤버변수를 private으로 선언하면 클래스 외부에서는 접근이
		볼가능하므로 아래 코드는 모두 에러가 발생된다.
		즉, 멤버변수의 정보은닉을 통해 비정상적인 접근을 차단하고,
		멤버메소드를 통해서만 구매가 이루어질 수 있도록 구현한다.
		 */
//		seller1.myMoney += 1000; //판매자1에게 1000원을 지불하고
//		buyer.myMoney -= 1000;
//		seller1.numOfApple -= 50;//사과 50개를 구매한다.
//		buyer.numOfApple += 50;//구매자는 50개가 증가한다.
//		
//		seller2.myMoney += 1000; //판매자2에게 1000원을 지불하고
//		seller2.numOfApple -= 70;//사과 70개를 구매한다.
//		buyer.numOfApple += 70;//구매자는 70개가 증가한다.
//								//구매자는 한푼도 지불하지 않음
		
		System.out.println("구매 행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
		
		
	}

}
