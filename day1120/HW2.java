package day1120;

/*
 0 0
  1 0 1 1
   2 0 2 1 2 2
     3 0 3 1 3 2 3 3 
  */
public class HW2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(i);
				System.out.print(j);
			} // end inner for
			System.out.println();
		} // end outer for

	}// main

}// class
