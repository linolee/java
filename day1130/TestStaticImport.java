package day1130;

/**
 * �ٸ� Ŭ������ static����(constant)�� method�� ���� Ŭ������ �ִ°� ó�� ����� ��<br>
 * import static ��Ű����.Ŭ������.������|method��
 * @author owner
 */
import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Byte.MAX_VALUE;
//���� �̸��� ����� �ΰ� �̻� ������ error
//method�� method�� ����Ѵ�
import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;
public class TestStaticImport {
	
	public static void main(String[] args) {

		int i = Integer.MAX_VALUE;
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(MAX_VALUE);
		
		String year = "2018";
		String month = "12";
		String day = "4";
		
		int intyear = parseInt(year);
		int intmonth = parseInt(month);
		int intday = parseInt(day);
		
		System.out.println(intyear+" / "+intmonth+" / "+intday);
		System.out.println(toBinaryString(intyear)+toBinaryString(intmonth)+toBinaryString(intday));
		
	}//main

}//class
