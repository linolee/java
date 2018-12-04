package day1120;

/**
 * switch-case를 사용한 학점 구하기
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
		 * char grade = ' '; //char는 문자를 저장한다. ''코드셋에 문자 없음. ' ' 공백문자(white
		 * space)-unicode \u0000~wuFFFF
		 */ int score = 11;
		char grade = 64;
		// case의 상수는 가독성이 떨어지기 때문에 Constant를 사용
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
//			break; default는 아랫줄에 실행될 코드가 없으므로 분기문을 사용하지 않는다
			}// end switch
			System.out.println(score + "점은 " + grade + "학점");
		} else {
			System.out.println("점수는 0~100 의 값이 입력되어야 합니다.");
		}//end if

	}// main

}// class
