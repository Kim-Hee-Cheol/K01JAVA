package ex09package.kosmo.seller;

import ex09package.kosmo.buyer.FruitBuyer4;

public class FruitSeller4 {
	//과일판매자를 추상화한 클래스
	int numOfApple; //판매자의 사과 보유개수
	int myMoney;//판매수익
	final int APPLE_PRICE;//다시 상수로 선언함. 
		
		
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;// <= 생성자 내에서는 상수를 초기화할 수있음.
	}
		
	public int saleApple(int money) {
		int num = money /APPLE_PRICE;//판매한 사과 개수
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}
