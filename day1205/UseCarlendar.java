package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : ���� ��¥ ������ ���� ��
 * 
 * @author owner
 */
public class UseCarlendar {
	public UseCarlendar() {
		// Calendar Ŭ������ �ν��Ͻ� ���
//		Calendar cal = new Calendar();
		// 1. getInstance ���
		Calendar cal = Calendar.getInstance();
		// 2. is a ����
		Calendar cal1 = new GregorianCalendar();
		// 3. �ڽĸ����� ��ü
		GregorianCalendar gc = new GregorianCalendar();

		System.out.println(cal);
		System.out.println(cal1);
		System.out.println(gc);

		// Constant�� ����ϸ� ������ ���
		int year = cal.get(Calendar.YEAR);
		// java������ ���� ������ 0��
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR);
		// ���� : ��-1 ��-2 ȭ-3 .......
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
//		switch(day_of_week) {
//		case Calendar.SUNDAY:			System.out.println("�Ͽ���");			break;
//		case Calendar.MONDAY:			System.out.println("������");			break;
//		case Calendar.TUESDAY:			System.out.println("ȭ����");			break;
//		case Calendar.WEDNESDAY:			System.out.println("������");			break;
//		case Calendar.THURSDAY:			System.out.println("�����");			break;
//		case Calendar.FRIDAY:			System.out.println("�ݿ���");			break;
//		case Calendar.SATURDAY:			System.out.println("�����");			
//		}//end switch
		String[] weekTitle = { "��", "��", "ȭ", "��", "��", "��", "��" };

		int am_pm = cal.get(Calendar.AM_PM);
		System.out.printf("%d,%s\n", am_pm, am_pm == Calendar.AM ? "����" : "����");

		int hour = cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d(%d)�� %d�� %d��\n", hour, hour24, minute, second);
		
		System.out.println("---------------------------------");
		System.out.printf("���� �� %d-%d-%d %s����\n",
				cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH)+1, cal1.get(Calendar.DAY_OF_MONTH),
				"��,��,ȭ,��,��,��,��".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
		//��
		cal1.set(Calendar.YEAR, 2019);
		//��
		cal1.set(Calendar.MONTH, 4);
		//�� : �ش���� �������� �ʴ� ���ڰ� �����Ǹ� �����޷� ����
		cal1.set(Calendar.DAY_OF_MONTH, 60);
		
		
		
		System.out.printf("���� �� %d-%d-%d %s����\n",
				cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH)+1, cal1.get(Calendar.DAY_OF_MONTH),
				"��,��,ȭ,��,��,��,��".split(",")[cal.get(Calendar.DAY_OF_WEEK)-1]);

		System.out.printf("%s���� %d\n", weekTitle[day_of_week - 1], day_of_week);
		System.out.printf("%d-%d-%d, ������ ������ %d��°, �̹����� %d��° ���Դϴ�.\n", year, month, day, day_of_year, day_of_week);

	}

	public static void main(String[] args) {
		new UseCarlendar();
	}

}
