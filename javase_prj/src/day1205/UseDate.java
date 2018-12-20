package day1205;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ������ �ִ� ��¥ ������ ���� ��<br>
 * ���� - java.text.SiimpleDateFormat<br>
 * ��¥ ���� - java.util.Date<br>
 * @author owner
 */
public class UseDate {
	public UseDate() {
		Date date = new Date();
		System.out.println(date);
//		System.out.println(date.getYear());//����õmethod�� ����
		//Locale - �ٸ������� ��¥ �������� �����Ͽ� ������ ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a EEEE HH(hh,kk):mm:ss",Locale.KOREA);
		String formatDate = sdf.format(date);
		System.out.println(formatDate);
	}//UseDate
	
	
	public static void main(String[] args) {
		new UseDate();
	}//main

}//class
