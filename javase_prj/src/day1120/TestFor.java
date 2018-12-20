package day1120;

/**
 * for : 시작과 끝을 알 때 사용하는 반복문<br>
 * 문법 : for ( 시작값; 끝값; 증가|감소식){<br>
 * 반복수행문장<br>
 * }
 * 
 * @author owner
 */
public class TestFor {

	public static void main(String[] args) {
		// 0에서부터 10보다 작은 수를 출력하는 for
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번 안녕");
		}

		// 1에서부터 100까지 반복수행하는 for
		for (int i = 1; i < 101; i++) {// <=는 < = 각각 연산하므로 for문에는 될 수 있으면 < > 만 쓴다.
			System.out.println("안녕*" + i);
		}

		// 1에서부터 100까지 짝수만 출력하는 for
		for (int i = 1; i < 101; i += 2) {// <=는 < = 각각 연산하므로 for문에는 될 수 있으면 < > 만 쓴다.
			System.out.print((i + 1) + ", ");
		}
		System.out.println("");
		for (int i = 1; i < 101; i++) {// <=는 < = 각각 연산하므로 for문에는 될 수 있으면 < > 만 쓴다.
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("");

		// 1에서부터 100까지 홀수만 출력하는 for
		for (int i = 1; i < 101; i += 2) {// <=는 < = 각각 연산하므로 for문에는 될 수 있으면 < > 만 쓴다.
			System.out.print(i + ", ");
		}
		System.out.println("");
		for (int i = 1; i < 101; i++) {// <=는 < = 각각 연산하므로 for문에는 될 수 있으면 < > 만 쓴다.
			if (i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}
		System.out.println("");
		// 1~100까지 출력하기 3의 배수마다 숫자 대신 "짝"을 출력
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.print("짝, ");
			} else {
				System.out.print(i + ", ");
			} // end if
		} // end for
		System.out.println("");
		// 1~100까지의 합 출력
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		} // end for
		System.out.println(sum);
		// A~Z까지 출력
		for (char i = 65; i < 91; i++) {
			System.out.println(i);
		} // end for



	}// main
}// class
