package day1205;

/**
 * 1970sus 01월 01일 00:00:00 UTC로부터 현재 날짜의 시간을 ms로 얻어내는 System.currentTimeMillis() 사용 
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
