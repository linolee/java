package day1206;

import java.text.DecimalFormat;

/**
 * DecimalFormat<br>
 * 숫자를 지정한 문자열로 변경
 * 
 * @author owner
 */
public class UseDecmalFormat {

	public UseDecmalFormat() {
		int temp = 20181206;
		System.out.println(temp);

		DecimalFormat df = new DecimalFormat("0,000,000,000");
		System.out.println("0 사용 : " + df.format(temp));
		DecimalFormat df1 = new DecimalFormat("#,###,###,###");
		System.out.println("# 사용 : " + df1.format(temp));
		DecimalFormat df2 = new DecimalFormat("#,###,###,###.00");
		System.out.println("소수 자리수 표현 : " + df2.format(201812.064));
		System.out.println("소수 자리수 표현 : " + df2.format(201812.065));
		//실수 자릿수를 이용하면 마지막 뒷자리의 값이 반올림 대상이라면 반올림한 결과를 보여준다.

	}// UseDecmalFormat

	public static void main(String[] args) {
		new UseDecmalFormat();
	}// main

}// class
