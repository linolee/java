package day1130;

/**
 * 다른 클래스의 static변수(constant)나 method를 현재 클래스에 있는것 처럼 사용할 때<br>
 * import static 패키지명.클래슴명.변수명|method명
 * @author owner
 */
import static java.lang.Integer.MAX_VALUE;
//import static java.lang.Byte.MAX_VALUE;
//같은 이름의 상수를 두개 이상 받으면 error
//method는 method명만 기술한다
import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;
public class TestStaticImport {
	
	public static void main(String[] args) {

		int i = Integer.MAX_VALUE;
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(MAX_VALUE);
		
		String year = "2018";
		String month = "12";
		String day = "4";
		
		int intyear = parseInt(year);
		int intmonth = parseInt(month);
		int intday = parseInt(day);
		
		System.out.println(intyear+" / "+intmonth+" / "+intday);
		System.out.println(toBinaryString(intyear)+toBinaryString(intmonth)+toBinaryString(intday));
		
	}//main

}//class
