package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 단일 날짜 정보를 얻을 때
 * @author owner
 */
public class UseCarlendar {
	public UseCarlendar() {
	//Calendar 클래스의 인스턴스 얻기
//		Calendar cal = new Calendar();
		//1. getInstance 사용
		Calendar cal = Calendar.getInstance();
		//2. is a 관계
		Calendar cal1 = new GregorianCalendar();
		//3. 자식만으로 객체
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(gc);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
	}
	
	public static void main(String[] args) {
		new UseCarlendar();
	}

}
