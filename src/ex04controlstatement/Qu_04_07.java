package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		
		int sum = 0;
		//1~100까지의 반복
		for(int i=1 ; i<=100 ; i++) {
			if(i%3==0 || i%7==0) { //3의배수 이거나 7의배수
				if(i%(3*7)!=0) { //3과7의 공배수가 아닌 정수
					sum += i;
					System.out.println("i="+i);
				}
			}
		}
		System.out.println("결과="+ sum);
	}

}
