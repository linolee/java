package day1206;

import java.util.ArrayList;
import java.util.Random;

/**
 * 1. 아래의 데이터를 처리하는 프로그램을 작성하세요. 백인재,이봉현,이재찬,정택성,이재현,김정운 의 데이터가 존재하고, 점수는 0~100점
 * 사이로 발생할수있습니다.
 * 
 * 프로그램이 실행되면 위의 사람중에 2명이상 성적처리 대상자 이고 n명의 이름과 점수를 저장하여 출력하는 일을 하는 프로그램 작성.
 * 중복이름은 들어갈 수 없다.
 * 
 * 출력 예 ) 이재찬 89 정택성 77 김정운 90 총점 xx점
 * 
 * 
 * @author owner
 */
public class HW2 {

	ArrayList<String> name = new ArrayList<>();
	ArrayList<String> pickedname = new ArrayList<>();
	ArrayList<Integer> score = new ArrayList<>();

	public HW2(int num) {
		putName();
		pickName(num);
		score(num);
		print(num);
	}

	public HW2() {
		Random r = new Random();
		int num = r.nextInt(5) + 2;
		putName();
		pickName(num);
		score(num);
		print(num);
	}

//	public ArrayList<String> makeName(){
//		return name;
//	}
//	// 1.이름 리스트 생성
//	
	public void putName() {
		name.add("백인재");
		name.add("이봉현");
		name.add("이재찬");
		name.add("정택성");
		name.add("이재현");
		name.add("김정운");
	}
	// 2.리스트에 이름을 입력

	public ArrayList<String> pickName(int num) {
		int i = 0;
		while (i < num) {
			Random r = new Random();
			String tempname = name.get(r.nextInt(name.size()));
			if (!pickedname.contains(tempname)) {
				pickedname.add(tempname);
				i++;
			}

		}
		return pickedname;
	}
	// 3.이름을 n명 받는 method

	public ArrayList<Integer> score(int num) {
		Random r = new Random();
		for (int i = 0; i < num; i++) {
			score.add(r.nextInt(101));
		}

		return score;
	}
	// 4.n개의 랜덤점수 리스트를 만드는 method

	public void printNameScore() {
		int sum_score = 0;
		for (int i = 0; i < pickedname.size(); i++) {
			System.out.printf("%s  %d  \n", pickedname.get(i), score.get(i));
			sum_score = sum_score + score.get(i);
		}
		System.out.println("총점 " + sum_score + "점");
	}
	// 5.입력한 이름과 점수를 순서대로 출력하는 method

	public void print(int num) {

		if (num < 2 || num > 6) {
			System.out.printf("2에서 6 사이의 숫자를 입력해주세요");
		} else {
			printNameScore();
		}
	}
	// 6.n명의 이름과 점수를 순서대로 출력하는 method



	public static void main(String[] args) {
		HW2 hw1 = new HW2(3);
		
		HW2 hw2 = new HW2();
	}// main
}// class
