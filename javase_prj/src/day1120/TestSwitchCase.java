package day1120;

/**
 * switch-case�� ����� ���� ���ϱ�
 * 
 * @author owner
 */
public class TestSwitchCase {
	public static final int GRADE_A_PLUS = 10;
	public static final int GRADE_A = 9;
	public static final int GRADE_B = 8;
	public static final int GRADE_C = 7;
	public static final int GRADE_D = 6;

	public static void main(String[] args) {

		/*
		 * char grade = ' '; //char�� ���ڸ� �����Ѵ�. ''�ڵ�¿� ���� ����. ' ' ���鹮��(white
		 * space)-unicode \u0000~wuFFFF
		 */ int score = 11;
		char grade = 64;
		// case�� ����� �������� �������� ������ Constant�� ���
		if (score <= 100 && score >= 0) {

			switch (score / 10) {
			case GRADE_D:
				grade++;
			case GRADE_C:
				grade++;
			case GRADE_B:
				grade++;
			case GRADE_A:
			case GRADE_A_PLUS:
				grade++;
				break;
			default:
				grade += GRADE_D;
				/*
				 * case 10: case 9: grade = 'A'; break; case 8: grade = 'B'; break; case 7:
				 * grade = 'C'; break; case 6: grade = 'D'; break; default: grade = 'F';
				 */
//			break; default�� �Ʒ��ٿ� ����� �ڵ尡 �����Ƿ� �б⹮�� ������� �ʴ´�
			}// end switch
			System.out.println(score + "���� " + grade + "����");
		} else {
			System.out.println("������ 0~100 �� ���� �ԷµǾ�� �մϴ�.");
		}//end if

	}// main

}// class
