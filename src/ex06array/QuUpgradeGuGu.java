package ex06array;

/*
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489

 */
public class QuUpgradeGuGu {

	public static void main(String[] args) {
		for(int dan=2 ; dan<=9 ; dan ++) {
			for(int su=1 ; su<=9 ; su++) {
			
					
					System.out.println();
			}
		}
	}
public static String getGender() {
		
		String jumin = "970121-1214241";
		char ch = jumin.charAt(7);
		if(ch==1 || ch==3) {
			return "남자";
		}
		else if(ch==2 || ch==4) {
			return "여자";
		}
		else {
			return "외국인";
		}
	}
	
}


