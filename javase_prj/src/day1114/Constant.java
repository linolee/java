package day1114;
/*
	Constant (������ ���ó�� ����ϴ� ��) �� ���
*/

class Constant{
	//Constant ����
	public static int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;
	public static void main(String[] args) {
		System.out.println(MAX_SCORE + " / " + MIN_SCORE);
		System.out.println(Constant.MAX_SCORE + " / " + Constant.MIN_SCORE);
		int MyScore = 80;
		//MAX_SCORE = 99; // ������� ���Ҵ� X
		System.out.println("������ �ְ����� "+MAX_SCORE+"�̰� �������� " +MIN_SCORE+ "�Դϴ�. ȹ�������� "+MyScore+"�̰�, �ְ����� ȹ�������� ���̴� "+(MAX_SCORE-MyScore)+"�Դϴ�.");
		
	}//main
}//class
