package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : ���� ��¥ ������ ���� ��
 * @author owner
 */
public class UseCarlendar {
	public UseCarlendar() {
	//Calendar Ŭ������ �ν��Ͻ� ���
//		Calendar cal = new Calendar();
		//1. getInstance ���
		Calendar cal = Calendar.getInstance();
		//2. is a ����
		Calendar cal1 = new GregorianCalendar();
		//3. �ڽĸ����� ��ü
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
