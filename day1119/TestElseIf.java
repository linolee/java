package day1119;

/**
 * else~if : 연관된 여러조건을 비교할 때.<br>
 * 문법) if(조건식){<br>
 * 조건에 맞을 때 수행할 문장들;<br>
 * }else if(조건식){<br>
 * 조건에 맞을 때 수행할 문장들;<br>
 * }else if(조건식){<br>
 * 조건에 맞을 때 수행할 문장들;<br>
 * }else {<br>
 * 조건에 맞지 않을 때 수행할 문장들;<br>
 * }<br>
 * 
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		System.out.print(i + "은(는) ");
		if (i < 0) {
			System.out.println("0보다 작아서 입력실패");
		} else if (i > 100) {
			System.out.println("100보다 커서 입력실패");
		} else {
			System.out.println("입력 성공");
		} // end if

		// 이름을 입력받아 "이재찬"이면 반장을 이봉현, 박영민, 김정운, 오영근이면 조장, 그렇지 않으면 평민을 이름 앞에 출력
		if (args[1].equals("이재찬")) {
			System.out.println("반장");
		} else if (args[1].equals("이봉현") || args[1].equals("박영민") || args[1].equals("김정운") || args[1].equals("오영근")) {
			System.out.println("조장");
		} else {
			System.out.println("평민");
		} // end if
		System.out.println(args[1] + "님 안녕하세요.");

		// 태어난 해를 입력받아 띠 구하기
		int j = Integer.parseInt(args[2]);
		int k = (j % 12);
		if (k == 0) {
			System.out.println("원숭이");
		} else if (k == 1) {
			System.out.println("닭");
		} else if (k == 2) {
			System.out.println("개");
		} else if (k == 3) {
			System.out.println("돼지");
		} else if (k == 4) {
			System.out.println("쥐");
		} else if (k == 5) {
			System.out.println("소");
		} else if (k == 6) {
			System.out.println("호랑이");
		} else if (k == 7) {
			System.out.println("토끼");
		} else if (k == 8) {
			System.out.println("용");
		} else if (k == 9) {
			System.out.println("뱀");
		} else if (k == 10) {
			System.out.println("말");
		} else if (k == 11) {
			System.out.println("양");
		} else {
			System.out.println("올바른 해을 입력해 주세요.");
		}
		// end if

	}// main

}// class
