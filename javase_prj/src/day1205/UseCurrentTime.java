package day1205;

/**
 * 1970sus 01�� 01�� 00:00:00 UTC�κ��� ���� ��¥�� �ð��� ms�� ���� System.currentTimeMillis() ��� 
 * @author owner
 */
public class UseCurrentTime {

	public void test() {
			for (int i=0; i<5000; i++) {
				System.out.println(i);
			}
	}//test
	public static void main(String[] args) {
		long[] avgTime = new long[17];
		UseCurrentTime uct = new UseCurrentTime();
		for (int i = 0; i<avgTime.length; i++) {
			long st = System.currentTimeMillis();
			uct.test();
			long et = System.currentTimeMillis();
			avgTime[i] = (et-st);
		}
//		System.out.println((et-st)+"ms");
	}//main

}
