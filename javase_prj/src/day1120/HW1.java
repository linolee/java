package day1120;

/*
 2x1=2    3x1=3  4x1=4  ...            9x1=9
.
.
.
2x9=18                                     9x9=81
 */
public class HW1 {

	public static void main(String[] args) {
		// ±¸±¸´Ü
		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				System.out.print(j + "x" + i + "=" + i * j+"    ");
			} // end inner for
			System.out.println();
		} // end outer for
	}

}
