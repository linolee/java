package day1206;

import java.util.ArrayList;
import java.util.Random;

/**
 *	1. �Ʒ��� �����͸� ó���ϴ� ���α׷��� �ۼ��ϼ���.
  ������,�̺���,������,���ü�,������,������ �� �����Ͱ� �����ϰ�,
 ������ 0~100�� ���̷� �߻��Ҽ��ֽ��ϴ�.

 ���α׷��� ����Ǹ� ���� ����߿� 2���̻� ����ó�� ����� �̰� 
 n���� �̸��� ������ �����Ͽ� ����ϴ� ���� �ϴ� ���α׷� �ۼ�.
 �ߺ��̸��� �� �� ����.

��� �� )
 ������ 89
 ���ü� 77
 ������ 90
  ����   xx��


 *  @author owner
 */
public class HW1 {
	public ArrayList<String> makeName(){
		ArrayList<String> name = new ArrayList<>(); 
		return name;
	}
	// 1.�̸� ����Ʈ ����
	
	public ArrayList<String> putName(ArrayList<String> name) {
		name.add("������");
		name.add("�̺���");
		name.add("������");
		name.add("���ü�");
		name.add("������");
		name.add("������");
		return name;
	}
	// 2.����Ʈ�� �̸��� �Է�
//	
//	public ArrayList<String> pickName(ArrayList<String> name, int num){
//		ArrayList<String> pickedname = new ArrayList<>();
//		int i = 0;
//		while(i<num) {
//			Random r = new Random();
//			String tempname = name.get(r.nextInt(name.size()));
//			if (!pickedname.contains(tempname)) {
//				pickedname.add(tempname);
//				i++;
//			}
//			
//		}
//		return pickedname;
//	}
//	// 3.�̸��� n�� �޴� method
	
	public ArrayList<String> pickName(ArrayList<String> name, int num){
		ArrayList<String> pickedname = new ArrayList<>();
		final int INIT = name.size();
		Random r = new Random();
		while(name.size() !=INIT-num) {
			String tempname = name.get(r.nextInt(name.size()));
			name.remove(tempname);
			pickedname.add(tempname);
		}
			
		
		return pickedname;
	}
	// 3.�̸��� n�� �޴� method
	
	
	public ArrayList<Integer> score(int num){
		ArrayList<Integer> score = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < num; i++) {
		score.add(r.nextInt(101));
		}
		
		return score;
	}
	// 4.n���� �������� ����Ʈ�� ����� method
	
	
	
	public void printNameScore(ArrayList<String> pickedname, ArrayList<Integer> score) {
		int sum_score = 0;
		for(int i = 0; i<pickedname.size(); i++) {
			System.out.printf("%s  %d  \n",pickedname.get(i),score.get(i));
			sum_score = sum_score+score.get(i);
		}
		System.out.println("���� "+sum_score+"��");
	}
	// 5.�Է��� �̸��� ������ ������� ����ϴ� method
	
	public void print(int num) {
		
		if (num < 2|| num> 6) {
			System.out.printf("2���� 6 ������ ���ڸ� �Է����ּ���");
		}else {
		printNameScore(pickName(putName(makeName()), num),score(num));
		}
	}
	// 6.n���� �̸��� ������ ������� ����ϴ� method 
	
	public void printRandom() {
		Random r = new Random();
		print(r.nextInt(5)+2);
	}
	
	// 6-1. 2~6���� �̸��� ������ ������� ����ϴ� method
	
	public static void main(String[] args) {
		HW1 hw1 = new HW1();
		
//		hw1.print(3);
		hw1.printRandom();
	}//main
}//class
