package day1206;

import java.util.Random;

/**
 * Random : �پ��� ������ ��� ���� ��ü
 * 
 * @author owner
 */
public class UseRandom {
	public UseRandom() {
		// 1. ����
		Random r = new Random();
		// �Ǽ� ����
		double d = r.nextDouble();
		System.out.println(d);
		System.out.println(d*5);
		System.out.println("======================");
		// ���� ����
		int i = r.nextInt();
		System.out.println(i);
		System.out.println(i%5);
		int j = r.nextInt(5);
		System.out.println(j);
		// �Ҹ� ����
		boolean b = r.nextBoolean();
		System.out.println(b);
	}//UseRandom

	public static void main(String[] args) {
		new UseRandom();
	}//main

}//class
