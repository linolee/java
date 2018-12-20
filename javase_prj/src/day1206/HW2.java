package day1206;

import java.util.ArrayList;
import java.util.Random;

/**
 * 1. �Ʒ��� �����͸� ó���ϴ� ���α׷��� �ۼ��ϼ���. ������,�̺���,������,���ü�,������,������ �� �����Ͱ� �����ϰ�, ������ 0~100��
 * ���̷� �߻��Ҽ��ֽ��ϴ�.
 * 
 * ���α׷��� ����Ǹ� ���� ����߿� 2���̻� ����ó�� ����� �̰� n���� �̸��� ������ �����Ͽ� ����ϴ� ���� �ϴ� ���α׷� �ۼ�.
 * �ߺ��̸��� �� �� ����.
 * 
 * ��� �� ) ������ 89 ���ü� 77 ������ 90 ���� xx��
 * 
 * 
 * @author owner
 */
public class HW2 {

	ArrayList<String> name = new ArrayList<>();
	ArrayList<String> pickedname = new ArrayList<>();
	ArrayList<Integer> score = new ArrayList<>();
	int num;
	
	public HW2(int num) {
		this.num = num;
		putName();
		pickName(num);

	}

	public HW2() {
		Random r = new Random();
		this.num = r.nextInt(5) + 2;
		putName();
		pickName(num);
	}

//	public ArrayList<String> makeName(){
//		return name;
//	}
//	// 1.�̸� ����Ʈ ����
//	
	public void putName() {
		name.add("������");
		name.add("�̺���");
		name.add("������");
		name.add("���ü�");
		name.add("������");
		name.add("������");
	}
	// 2.����Ʈ�� �̸��� �Է�

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
	// 3.�̸��� n�� �޴� method

	public ArrayList<Integer> score(int num) {
		Random r = new Random();
		for (int i = 0; i < num; i++) {
			score.add(r.nextInt(101));
		}
		this.num = num;

		return score;
	}
	
	public ArrayList<Integer> score() {
		Random r = new Random();
		for (int i = 0; i < this.num; i++) {
			score.add(r.nextInt(101));
		}
		
		return score;
	}
	// 4.n���� �������� ����Ʈ�� ����� method

	public void printNameScore() {
		int sum_score = 0;
		for (int i = 0; i < pickedname.size(); i++) {
			System.out.printf("%s  %d  \n", pickedname.get(i), score.get(i));
			sum_score = sum_score + score.get(i);
		}
		System.out.println("���� " + sum_score + "��");
	}
	// 5.�Է��� �̸��� ������ ������� ����ϴ� method

	public void print(int num) {

		if (num < 2 || num > 6) {
			System.out.printf("2���� 6 ������ ���ڸ� �Է����ּ���");
		} else {
			printNameScore();
		}
	}
	public void print() {
		
		if (num < 2 || num > 6) {
			System.out.printf("2���� 6 ������ ���ڸ� �Է����ּ���");
		} else {
			printNameScore();
		}
	}
	// 6.n���� �̸��� ������ ������� ����ϴ� method



	public static void main(String[] args) {
		HW2 hw1 = new HW2(3);
		hw1.score();
		hw1.print();
		HW2 hw2 = new HW2();
		hw2.score();
		hw2.print();
	}// main
}// class
