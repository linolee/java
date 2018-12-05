package day1205;

import java.util.StringTokenizer;

/**
 * 1. 1~45 ������ ������ ���߿��� �������� �ϳ��� �̾� 6���� ��Ʈ�� ����� �迭�� ��ȯ�ϴ� method�� ����� ȣ���Ͽ� ����� ��.
 * ��, �ߺ��� ���� �迭�� �Էµ��� �ʾƾ��Ѵ�.
 * 
 * @author owner
 */

public class HW3 {
	// 1. "1,2,3,4,....45," String�� ����� method
	// 2. String�� tokenize�ϴ� method
	// 3. tokenize �迭���� ���ڸ� �ϳ� �̾Ƴ��� method
	// 4. �̾Ƴ� ���ڸ� ����� ���ο� Strint�� ����� method
	// 5. 6�� �ݺ��ϴ� method
	String pickedball;
	String ballbox = "";
	String[] pickedballs = new String[6];

	public void makeBox() {
		for (int i = 0; i < 45; i++) {
			ballbox = ballbox.concat(String.valueOf(i + 1).concat(","));
		}
//		System.out.println("ó�� ������ box : " + ballbox);
	}// 1. "1,2,3,4,....45," String�� ����� method

	public void pickBall() {
		String tempballbox = "";
		StringTokenizer stk = new StringTokenizer(ballbox, ",");

		int ballnum = (int) (Math.random() * stk.countTokens())+1;
		int i = 1;
		while (stk.hasMoreTokens()) {
			if (i == ballnum) {
				pickedball = stk.nextToken();
			} else {
				tempballbox = tempballbox.concat(stk.nextToken()).concat(",");
			}
			i++;
		}
		ballbox = tempballbox;
//		System.out.println("���� ���� box : " + ballbox);
	}// 2.ballbox���� �ϳ��� ���� ��� pickedball�� �ְ� �������� �ٽ� String���� ����� method

	public void putBall(int i) {
		pickedballs[i] = pickedball;
	}// 3. pickedballs�� i��° �濡 pickedball�� �ִ� method

	public void lotto() {
		makeBox();
		for (int i = 0; i < pickedballs.length; i++) {
			pickBall();
			putBall(i);
		}
	}// 4. 1�� �ѹ� �����ϰ��� 2,3�� �ݺ��ؼ� pickedballs�� ���� ä��� method

	public void printlotto() {
		for (int i = 0; i < pickedballs.length; i++) {
			System.out.printf("[%s]", pickedballs[i]);
		}
	}// 5. pickedballs�� ����ϴ� method

	public static void main(String[] args) {
		HW3 hw3 = new HW3();
		hw3.lotto();
		hw3.printlotto();

	}

}
