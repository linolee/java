package day1122;

/**
 * 다형성 : method Overload<br>
 * 하나의 클래스에서 같은 이름의 method를 여러개 작성하는 것.<br>
 * 규칙) 접근지정자 반환형 method명 까지는 동일하게 만들고 매개변수만 다르게 작성<br>
 * 
 * @author owner
 */
public class TestOverload {
	/**
	 * ★을 하나 출력하는 일
	 */
	public void printStar() {
		System.out.println("★");
	}// printStar

	
	/**
	 * ★을 여러개 출력하는 일
	 * @param count 별 개수
	 */
	public void printStar(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print("★");
		} // end for
		System.out.println();
	}// printStar

	/**
	 * 구구단 3단을 출력
	 */
	public void Gugu() {
		for (int i = 1; i < 10; i++) {
			System.out.print(3 + "x" + i + "=" + 3 * i + "   ");
		} // end for
		System.out.println();
	}// Gugu

	/**
	 * 입력된 단수의 해당 단부터 9단까지 출력
	 * 
	 * @param j 구구단의 단수
	 */
	public void Gugu(int j) {
		if (j < 2 || j > 9) {
			System.out.println("2에서 9 사이의 정수를 입력하세요.");
		} else {
			for (; j < 10; j++) {
				for (int i = 1; i < 10; i++) {
					System.out.print(j + "x" + i + "=" + j * i + "   ");
				} // end inner for
				System.out.println();
			} // end outer for

		} // end if

	}// Gugu

	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();
		to.printStar(5);

		to.Gugu();
		// 구구단 3단을 출력하는 method
		to.Gugu(6);
		// 입력하는 단이 2~9단 사이일 때 해당 단부터 9단까지 출력하는 method
	}// main
}// class
