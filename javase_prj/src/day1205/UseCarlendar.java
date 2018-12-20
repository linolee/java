package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 단일 날짜 정보를 얻을 때
 * 
 * @author owner
 */
public class UseCarlendar {
	public UseCarlendar() {
		// Calendar 클래스의 인스턴스 얻기
//		Calendar cal = new Calendar();
		// 1. getInstance 사용
		Calendar cal = Calendar.getInstance();
		// 2. is a 관계
		Calendar cal1 = new GregorianCalendar();
		// 3. 자식만으로 객체
		GregorianCalendar gc = new GregorianCalendar();

		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(gc);

		// Constant를 사용하면 가독성 향상
		int year = cal.get(Calendar.YEAR);
		// java에서는 월의 시작이 0월
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR);
		// 요일 : 일-1 월-2 화-3 .......
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
//		switch(day_of_week) {
//		case Calendar.SUNDAY:			System.out.println("일요일");			break;
//		case Calendar.MONDAY:			System.out.println("월요일");			break;
//		case Calendar.TUESDAY:			System.out.println("화요일");			break;
//		case Calendar.WEDNESDAY:			System.out.println("수요일");			break;
//		case Calendar.THURSDAY:			System.out.println("목요일");			break;
//		case Calendar.FRIDAY:			System.out.println("금요일");			break;
//		case Calendar.SATURDAY:			System.out.println("토요일");			
//		}//end switch
		String[] weekTitle = { "일", "월", "화", "수", "목", "금", "토" };

		int am_pm = cal.get(Calendar.AM_PM);
		System.out.printf("%d,%s\n", am_pm, am_pm == Calendar.AM ? "오전" : "오후");

		int hour = cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d(%d)시 %d분 %d초\n", hour, hour24, minute, second);
		
		System.out.println("---------------------------------");
		System.out.printf("설정 전 %d-%d-%d %s요일\n",
				cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH)+1, cal1.get(Calendar.DAY_OF_MONTH),
				"일,월,화,수,목,금,토".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		//년
		cal1.set(Calendar.YEAR, 2019);
		//월
		cal1.set(Calendar.MONTH, 4);
		//일 : 해당월에 존재하지 않는 일자가 설정되면 다음달로 설정
		cal1.set(Calendar.DAY_OF_MONTH, 60);
		
		
		
		System.out.printf("설정 후 %d-%d-%d %s요일\n",
				cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH)+1, cal1.get(Calendar.DAY_OF_MONTH),
				"일,월,화,수,목,금,토".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]);

		System.out.printf("%s요일 %d\n", weekTitle[day_of_week - 1], day_of_week);
		System.out.printf("%d-%d-%d, 오늘은 올해의 %d번째, 이번주의 %d번째 날입니다.\n", year, month, day, day_of_year, day_of_week);

	}

	public static void main(String[] args) {
		new UseCarlendar();
	}

}
