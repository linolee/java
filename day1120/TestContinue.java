package day1120;

/**
 * �ݺ��� ���� �ݺ����� �ڵ��� ������ �ǳ� �ٴ� ��.<br>
 * 
 * @author owner
 */
public class TestContinue {

	public static void main(String[] args) {
		System.out.println(args);
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 0) {
				continue;
			}//end if
			System.out.println("i = " + i);
		}//end for
	}//main

}//class
