/*숙제
1.  while을 사용하여 구구단 전체 단을 출력하는  instance method를
    작성하고, 호출하세요.

2.  do~while을 사용하여 아래의 형태의  *을 출력하는  static method를
    작성하여 호출하세요.
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
