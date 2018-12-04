package day1119;

/**
 * switch~case : 정수를 비교할 때. (JDK1.7에서부터 문자열도 비교 가능)<br>
 * 문법 ) switch(변수명){
 * 					case 상수 : 수행문장;
 * 					case 상수 : 수행문장;
 * 									.
 *  								.
 *  				default : 일치하는 상수가 없을 때 수행문장;<br>
 *  				}
 * @author owner
 */
public class TestSwitchCase {
		
	public static void main(String[] args) {
		int i = 0;
		//case는 입력되는 변수에 따라 다른 범위를 가진다.
		switch(i) {//switch에 입력되는 변수의 데이터형은 byte, short, int, char, string
		case 0 : System.out.println("아침");
		case 1 : System.out.println("점심");
		case 2 : System.out.println("저녁");
		default : System.out.println("새벽");
		
		}//end switch
		
		
		
	}

}
