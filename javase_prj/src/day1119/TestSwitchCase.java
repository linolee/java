package day1119;

/**
 * switch~case : ������ ���� ��. (JDK1.7�������� ���ڿ��� �� ����)<br>
 * ���� ) switch(������){
 * 					case ��� : ���๮��;
 * 					case ��� : ���๮��;
 * 									.
 *  								.
 *  				default : ��ġ�ϴ� ����� ���� �� ���๮��;<br>
 *  				}
 * @author owner
 */
public class TestSwitchCase {
		
	public static void main(String[] args) {
		int i = 0;
		//case�� �ԷµǴ� ������ ���� �ٸ� ������ ������.
		switch(i) {//switch�� �ԷµǴ� ������ ���������� byte, short, int, char, string
		case 0 : System.out.println("��ħ");
		case 1 : System.out.println("����");
		case 2 : System.out.println("����");
		default : System.out.println("����");
		
		}//end switch
		
		
		
	}

}
