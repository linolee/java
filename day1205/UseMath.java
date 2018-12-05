package day1205;

/**
 * Math : 객체를 생성하지 않고 사용하는 클래스.
 * 
 * @author owner
 */
public class UseMath {

	public UseMath() {
//		Math m = new Math();
		int i = -12;
		System.out.println(i + "의 절대값 : " + Math.abs(i));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.1));
		double d = Math.random();
		System.out.println(d);
		System.out.println("발생한 난수 : " + d);
		System.out.println("범위를 설정한 난수 : " + d * 5);
		System.out.println("발생한 난수 : " + (int) (d * 5));
		// A(65)-Z(90)중 하나의 문자를 반환하는 일.
		System.out.println((char) ((int) (d * 26) + 65));

	}// UseMath

	public char[] createPassword() {

		char[] tempPass = new char[8];
		int i = 0;
		while (i < tempPass.length) {
			double d = Math.random();
			int tempnum = ((int) (d * 75 + 48));

			if (tempnum > 57 && tempnum < 65) {
				tempnum = 0;
			} else if (tempnum > 90 && tempnum < 97) {
				tempnum = 0;
			}

			if (tempnum != 0) {
				tempPass[i] = (char) tempnum;
				i++;
			}
		}

		return tempPass;
		
		// 영문자대문자, 소문자, 숫자로 이루어진 임의의 비밀번호 8자리를 생성하여 반환하는 일
	}

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		
		UseMath um = new UseMath();
		System.out.println("비번");
		for (int i = 0; i < um.createPassword().length; i++) {
			System.out.println(um.createPassword()[i]);
		}
		
		long et = System.currentTimeMillis();
		System.out.println((et - st) + "ms");
	}// main

}// class
