package day1205;

/**
 * 1. 1~45 까지의 사이의 수중에서 무작위로 하나를 뽑아 6개의 세트를 만들어 배열로 반환하는 method를 만들고 호출하여 출력할 것.
 * 단, 중복된 수는 배열에 입력되지 않아야한다.
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
	}// 1. 1~MAXBALLNUM 사이 공을 뽑는 method

	public boolean checkBall(int ball) {
		boolean flag = true;
		for (int i = 0; i < picked.length; i++) {
			if (ball == picked[i]) {
				return false;
			} // end if
		} // end for
		return flag;
	}// 2. 뽑은 공이 arr에 있으면 false, 없으면 true를 반환하는 method

	public int[] insertBall(int n, int ball) {
		picked[n] = ball;
		return picked;
	}// 3.picked의 n번째 방에공의 값을 넣는 method

	public void lotto() {
		int n = 0;
		while (picked[picked.length - 1] == 0) {
			int tempball = pickBall();
			if (checkBall(tempball)) {
				insertBall(n, tempball);
				n++;
			}
		}
	}// 4. 방이 가득 찰 때 까지 공을 뽑아서 확인하고 방에 넣는 method

	public void print() {
		for (int i = 0; i < picked.length; i++) {
			System.out.printf(" [%d] ", picked[i]);
		}
		System.out.println();
	}// 5. picked를 출력하는 method

	public static void main(String[] args) {
		HW1 hw = new HW1();
		hw.lotto();
		hw.print();
	}// main

}// class
