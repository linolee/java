package day1120;

/**
 * 다중 for : 인덱스를 여러개 사용해야하는 경우.<br>
 * 문법) for(시작값;끝값;증가.감소식){<br>
 * for(시작값;끝값;증가.감소식){<br>
 * 반복수행문장;<br>
 * }br }br
 * 
 * @author owner
 */
public class TestFor1 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.println("i : " + i + ", j : " + j);
			} // end inner for
			System.out.println("===============");
		} // end outer for



		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(i);
				System.out.print(j);
			} // end inner for
			System.out.println();
		} // end outer for
		System.out.println("==========");
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.print(i);
				System.out.print(j);
			}
			System.out.println();
		}

	}// main

}// class
