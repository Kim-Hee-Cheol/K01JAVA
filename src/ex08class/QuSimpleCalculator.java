package ex08class;
/*
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

 */


class CalculatorEx{
	
	//멤버변수 : 연산의 횟수를 카운트할 용도로 사용
	int addVal;
	int minVal;
	int mulVal;
	int divVal;
	
	public double add(int n1,int n2) {
		addVal++;//덧셈 연산횟수 카운트
		return n1+n2;
	}
	
	public double min(double n1, double n2) {
		minVal++;	
		return n1-n2;
	}
	
	public double mul(double n1, double n2) {
		mulVal++;
		return n1*n2;
	}
	
	public double div(double n1, double n2) {
		divVal++;
		return n1/n2;
	}

	public void init() {
		addVal = 0;
		minVal = 0;
		mulVal = 0;
	    divVal = 0;
	}
	//연산 횟수를 출력하는 멤버메소드
	void showOpCount() {
		System.out.println("덧셈횟수:"+ addVal);
		System.out.println("뺄셈횟수:"+ minVal);
		System.out.println("곱셈횟수:"+ mulVal);
		System.out.println("나눗셈횟수:"+ divVal);
	}

}


public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 =" +cal.add(1,2));
		System.out.println("10.5 - 5.5 = "+ cal.min(10.5,5.5));
		System.out.println("4.0 * 5.0 = "+ cal.mul(4.0,5.0));
		System.out.println("100/25 = "+cal.div(100,25));
		System.out.println("10.0 * 3.0 ="+ cal.mul(10.0,3.0));
		cal.showOpCount();
	}

}
