package day1205;

/**
 * 1. 1~45 ������ ������ ���߿��� �������� �ϳ��� �̾� 6���� ��Ʈ�� ����� �迭�� ��ȯ�ϴ� method�� ����� ȣ���Ͽ� ����� ��.
 * ��, �ߺ��� ���� �迭�� �Էµ��� �ʾƾ��Ѵ�.
 * 
 * @author owner
 */
public class HW1 {

	public HW1() {
	}// HW1

	final int NUMOFBALL = 6;
	final int MAXBALLNUM = 45;
	int[] picked = new int[NUMOFBALL];

	public int pickBall() {
		int ball = (int) (Math.random() * MAXBALLNUM)+1;
		return ball;
	}// 1. 1~MAXBALLNUM ���� ���� �̴� method

	public boolean checkBall(int ball) {
		boolean flag = true;
		for (int i = 0; i < picked.length; i++) {
			if (ball == picked[i]) {
				return false;
			} // end if
		} // end for
		return flag;
	}// 2. ���� ���� arr�� ������ false, ������ true�� ��ȯ�ϴ� method

	public int[] insertBall(int n, int ball) {
		picked[n] = ball;
		return picked;
	}// 3.picked�� n��° �濡���� ���� �ִ� method

	public void lotto() {
		int n = 0;
		while (picked[picked.length - 1] == 0) {
			int tempball = pickBall();
			if (checkBall(tempball)) {
				insertBall(n, tempball);
				n++;
			}
		}
	}// 4. ���� ���� �� �� ���� ���� �̾Ƽ� Ȯ���ϰ� �濡 �ִ� method

	public void print() {
		for (int i = 0; i < picked.length; i++) {
			System.out.printf(" [%d] ", picked[i]);
		}
		System.out.println();
	}// 5. picked�� ����ϴ� method

	public static void main(String[] args) {
		HW1 hw = new HW1();
		hw.lotto();
		hw.print();
	}// main

}// class
