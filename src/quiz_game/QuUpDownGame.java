package quiz_game;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {
	
	public static void QuUpDownGameStart() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int restart;
		boolean forEnd = false;//7번만에 맞추는지 확인하기 위한 변수
		while(true) {
		
			int com = random.nextInt(1000) % 100 + 1;
			System.out.println(com);
			
			for(int i=1; i<=7; i++) {
				System.out.println("1~100사이의 숫자입력");
				int user = sc.nextInt();
				
				if(user>com) {
					System.out.println("Down, 더 낮은숫자입니다.");
				}
				else if(user<com) {
					System.out.println("Up, 더 높은숫자입니다.");
				}
				else {
					System.out.println("일치합니다.");
					System.out.println(i+"번째 안에 성공");
					
					forEnd = true;
					break;
				}
			}
			if(forEnd == false) {
				System.out.println("실패");
			}
			
			while(true) {
				System.out.println("게임재시작(1), 종료(0)");
				System.out.println("재시작여부를 선택하세요.");
				restart = sc.nextInt();
				
				if(restart == 1) {
					System.out.println("게임 재시작!");
					return;
				}
				else if(restart == 0) {
					System.out.println("종료");
					break;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		QuUpDownGameStart();
		
	}

}
