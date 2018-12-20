package day1119;

/**
 * 조건문의 사용<br>
 * 단일 if문 : 조건에 맞는 경우에만 코드를 실행해야 할 때.<br>
 * 문법) if(조건식){<br>
 * 조건에 맞을 때 수행 문장들...;<br>
 * }
 * 
 * @author owner
 */
public class TestIf {
	public final static int FLAG1 = 20;// 기준값 상수 설정

	public static void main(String[] args) {

		/*
		 * int i = -10;// i값 할당 if (i < 0) { i = -i; } // end if System.out.println("i="
		 * + i);// 출력
		 */
		// 이름을 입력받아 이름이 "이재찬"이면 이름을 출력하기 전 "반장"을 출력하고 그렇지 않다면 이름만 출력

		if (args[0].equals("이재찬")) {
			System.out.print("반장 ");

		} // end if
		System.out.println(args[0]);

		// 숫자형태의 문자열을 정수로 변환
		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);

		System.out.println(i + "+" + j + "=" + (i + j));

		// args[3]를 입력받아 그 수가 20 이하라면 1250과 입력수를 곱하여 출력하고 그렇지 않으면 20보다 크다면 1250에 10%를 더한
		// 값과 입력수를 곱하여 출력

		int input3 = Integer.parseInt(args[3]); // 입력수
		int multi = 1250; // 입력수와 곱할 값
		if (input3 > TestIf.FLAG1) {
			multi = (int) (multi * 1.1); // 입력수가 20 초과일 때 입력수와 곱할 값에 10% 더해주기
			System.out.println(input3 * multi); // 출력
		}

	}// main
}// class
