package day1205;

import java.util.StringTokenizer;

/**
 * 아래 제시된 문자열을 구분 문자로 잘라내어 문자열 배열에 저장하고 반환하는 일을 하는 method를 작성하세요.<br>
 * "이재찬",이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의"<br>
 * 출력 : 이재찬 이재현 공선의 정택성 이재현 최지우 김희철 이재찬 이재찬 정택성 공선의<br>
 */
public class HW2 {

	public HW2() {
	}

	public String[] cutName(String name) {
		StringTokenizer stk = new StringTokenizer(name, ",\"~.!");
		String[] names = new String[stk.countTokens()];

		int i = 0;
		while (stk.hasMoreTokens()) {
			names[i]= stk.nextToken();
			i++;
		}
		return names;
	}

	public void printName(String[] names) {
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i]+ " ");
		}
	}
	public static void main(String[] args) {
		HW2 hw2 = new HW2();
		hw2.printName(hw2.cutName("\"이재찬\",이재현.공선의,정택성~이재현!최지우.김희철,이재찬,이재찬,정택성.공선의"));
	}

}
