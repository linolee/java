package day1121;

/**
 * while : 시작과 끝을 모를 때 사용하는 반복문<br>
 * 최소 0번 수행 최대 조건까지 수행<br>
 * 문법) while(조건식){<br>
 * 반복수행문장;<br>
 * }
 * 
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 100;// 초기값

		while (i < 10) {
			System.out.println("i=" + i);
			i++;// 증가식
		}
		System.out.println("=====================");

		// 단을 입력받아 2~9단 사이라면 구구단을 출력 (while 사용)
		if (Integer.parseInt(args[0]) > 1 && Integer.parseInt(args[0]) < 10) {
			int j = 1;
			while (j < 10) {
				System.out.println(Integer.parseInt(args[0]) + "x" + j + "=" + Integer.parseInt(args[0]) * j);
				j++;
			} // end while
		} else {
			System.out.println("2~9 값을 입력하세요");
		} // end if
		
		
	}// main

}// class
