package day1205;

/**
 * Math : ��ü�� �������� �ʰ� ����ϴ� Ŭ����.
 * 
 * @author owner
 */
public class UseMath {

	public UseMath() {
//		Math m = new Math();
		int i = -12;
		System.out.println(i + "�� ���밪 : " + Math.abs(i));
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.1));
		double d = Math.random();
		System.out.println(d);
		System.out.println("�߻��� ���� : " + d);
		System.out.println("������ ������ ���� : " + d * 5);
		System.out.println("�߻��� ���� : " + (int) (d * 5));
		// A(65)-Z(90)�� �ϳ��� ���ڸ� ��ȯ�ϴ� ��.
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
		
		// �����ڴ빮��, �ҹ���, ���ڷ� �̷���� ������ ��й�ȣ 8�ڸ��� �����Ͽ� ��ȯ�ϴ� ��
	}

	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		
		UseMath um = new UseMath();
		System.out.println("���");
		for (int i = 0; i < um.createPassword().length; i++) {
			System.out.println(um.createPassword()[i]);
		}
		
		long et = System.currentTimeMillis();
		System.out.println((et - st) + "ms");
	}// main

}// class
