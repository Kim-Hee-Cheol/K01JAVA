package ex04controlstatement;

import java.util.Scanner;

/*
출력]
	*
	* *
	* * *
	* * * *
	* * * * *

 */
public class Qu_04_06 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			
			int j=1;
			while(j<=5) {
				//j는 i의 갯수만큼만 출력한다.
				if(i>=j) {
					System.out.print("* ");
				}
				
				j++;
			}
			System.out.println();
			i++;
		}
			
	}

}
