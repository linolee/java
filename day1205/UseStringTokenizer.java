package day1205;

import java.util.StringTokenizer;

public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg = "오늘은 수요일입니다. 날씨는 -5입니다.";
		StringTokenizer stk = new StringTokenizer(msg);
		System.out.println("토큰의 수 : "+stk.countTokens());
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		System.out.println("----------------------------------------");
		//특정문자로 토큰 구분 : 매개변수가 2개인 생성자
		String names = "이재현,이재찬~정택성,김희철.김정운~김정윤,공선의";
		StringTokenizer stk1 = new StringTokenizer(names,",~.");
		System.out.println("토큰의 수 : "+stk1.countTokens());
		while (stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}
		//특정문자로 토큰 구분, 구분된 문자열도 토큰으로 처리 : 매개변수가 3개인 생성자
		System.out.println("---------------------------------------");
		StringTokenizer stk2 = new StringTokenizer(names, ",.~", false);
		while (stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}
		
		
		
		//공백으로 구분 : 매개변수 하나인 생성자 사용.
	}//UseStringTokenizer
	public static void main(String[] args) {

		new UseStringTokenizer();
		
	}//main

}//class
