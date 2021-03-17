package ex09package;

import ex09package.kosmo.buyer.FruitBuyer4;
import ex09package.kosmo.seller.FruitSeller4;

//구매자를 표현한 클래스

public class E03FruitSalesMain4 {

	public static void main(String[] args) {

		
		/*
		초기화 메소드를 정의하였으므로, 각각 성격이 다른 객체들을
		생성할 수 있다.
		 */
		//판매자1 : 사과갯수 100개 단가 1000원
		FruitSeller4 seller1 = new FruitSeller4(0,100,1000);
		
		//판매자2 : 사과갯수 80개 단가 500원
		FruitSeller4 seller2 = new FruitSeller4(0,80,500);
		
		//구매자 : 보유금액 10000원
		FruitBuyer4 buyer = new FruitBuyer4(10000,0);
		
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
		
	}

}
