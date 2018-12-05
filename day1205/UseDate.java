package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 형식이 있는 날짜 정보를 얻을 때<br>
 * 형식 - java.text.SiimpleDateFormat<br>
 * 날짜 정보 - java.util.Date<br>
 * @author owner
 */
public class UseDate {
	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(date.getYear());//비추천method가 많다
		//Locale - 다른나라의 날짜 형식으로 변경하여 제공할 때
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a EEEE HH(hh,kk):mm:ss",Locale.KOREA);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
	}//UseDate
	
	
	public static void main(String[] args) {
		new UseDate();
	}//main

}//class
