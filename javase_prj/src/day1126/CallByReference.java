package day1126;

/**
 * 
 * @author owner
 */
public class CallByReference {
	private int i;
	private int j;

	public void swap(CallByReference cbr) {
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap method so i = " + i + ", j = " + j);
	}// swap

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 11;
		cbr.j = 26;

		System.out.println("swap 전 값 i = " + cbr.i + ", j = " + cbr.j);

		cbr.swap(cbr);// 주소가 그대로 전달
		System.out.println("swap 후 값 i = " + cbr.i + ", j = " + cbr.j);
	}// main

}// class
