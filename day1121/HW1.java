/*����
1.  while�� ����Ͽ� ������ ��ü ���� ����ϴ�  instance method��
    �ۼ��ϰ�, ȣ���ϼ���.

2.  do~while�� ����Ͽ� �Ʒ��� ������  *�� ����ϴ�  static method��
    �ۼ��Ͽ� ȣ���ϼ���.
    *
    **
    ***
    ****
    */
package day1121;

public class HW1 {
	public void gugu() {
		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.print(i+"x"+j+"="+i * j+"   ");
				j++;
			} // end inner while
			System.out.println();
			i++;
		} // end outer while
	}// end method
	
	public static void star() {
		int j = 1;
		do {
			int i = 1;
			do {
				System.out.print("*");
				i++;
			} while (i < j + 1);// end inner while
			System.out.println();
			j++;
		} while (j < 5);// end outer while
	}// end method

	public static void main(String[] args) {
		HW1 hw = new HW1();
		hw.gugu();
		System.out.println("===================");
		HW1.star();
	}// main
}// class
