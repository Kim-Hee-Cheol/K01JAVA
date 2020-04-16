package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {
		
		System.out.println("자바의 간략한 구조");
		
		Date toDayOfDate = new Date();
		//Date클래스로 오늘날자 출력하기
		System.out.println("오늘날짜:" + toDayOfDate);
		
		/*
		SimpleDateFormat 클래스를 이용하여 우리가 흔히 사용하는 포맷인
		 년-월-일 시:분:초 형태로 변환하여 출력함.
		 */
		SimpleDateFormat simple= 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String toDayString = simple.format(toDayOfDate);
		System.out.println("변경된 날짜:" + toDayString);

	}
	 public int getCharNumber(String str, char c) {

		   int count = 0;

		   for(int i=0;i<str.length();i++) {

		        if(str.charAt(i) == c)

		            count++;

		   }

		   return count;

		    }

}
