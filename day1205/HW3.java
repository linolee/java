package day1205;

import java.util.StringTokenizer;

/**
 * 1. 1~45 까지의 사이의 수중에서 무작위로 하나를 뽑아 6개의 세트를 만들어 배열로 반환하는 method를 만들고 호출하여 출력할 것.
 * 단, 중복된 수는 배열에 입력되지 않아야한다.
 * 
 * @author owner
 */

public class HW3 {
	// 1. "1,2,3,4,....45," String을 만드는 method
	// 2. String을 tokenize하는 method
	// 3. tokenize 배열에서 숫자를 하나 뽑아내는 method
	// 4. 뽑아낸 숫자를 지우고 새로운 Strint을 만드는 method
	// 5. 6번 반복하는 method
	String pickedball;
	String ballbox = "";
	String[] pickedballs = new String[6];

	public void makeBox() {
		for (int i = 0; i < 45; i++) {
			ballbox = ballbox.concat(String.valueOf(i + 1).concat(","));
		}
//		System.out.println("처음 생성된 box : " + ballbox);
	}// 1. "1,2,3,4,....45," String을 만드는 method

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
//		System.out.println("공을 뽑은 box : " + ballbox);
	}// 2.ballbox에서 하나의 값을 골라 pickedball에 넣고 나머지는 다시 String으로 만드는 method

	public void putBall(int i) {
		pickedballs[i] = pickedball;
	}// 3. pickedballs의 i번째 방에 pickedball을 넣는 method

	public void lotto() {
		makeBox();
		for (int i = 0; i < pickedballs.length; i++) {
			pickBall();
			putBall(i);
		}
	}// 4. 1을 한번 시행하고나서 2,3을 반복해서 pickedballs를 가득 채우는 method

	public void printlotto() {
		for (int i = 0; i < pickedballs.length; i++) {
			System.out.printf("[%s]", pickedballs[i]);
		}
	}// 5. pickedballs를 출력하는 method

	public static void main(String[] args) {
		HW3 hw3 = new HW3();
		hw3.lotto();
		hw3.printlotto();

	}

}
