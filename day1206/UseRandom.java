package day1206;

import java.util.Random;

/**
 * Random : 다양한 난수를 얻기 위한 객체
 * 
 * @author owner
 */
public class UseRandom {
	public UseRandom() {
		// 1. 생성
		Random r = new Random();
		// 실수 난수
		double d = r.nextDouble();
		System.out.println(d);
		System.out.println(d*5);
		System.out.println("======================");
		// 정수 난수
		int i = r.nextInt();
		System.out.println(i);
		System.out.println(i%5);
		int j = r.nextInt(5);
		System.out.println(j);
		// 불린 난수
		boolean b = r.nextBoolean();
		System.out.println(b);
	}//UseRandom

	public static void main(String[] args) {
		new UseRandom();
	}//main

}//class
