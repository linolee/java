package day1205;

import java.util.StringTokenizer;

public class UseStringTokenizer {
	
	public UseStringTokenizer() {
		String msg = "������ �������Դϴ�. ������ -5�Դϴ�.";
		StringTokenizer stk = new StringTokenizer(msg);
		System.out.println("��ū�� �� : "+stk.countTokens());
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		System.out.println("----------------------------------------");
		//Ư�����ڷ� ��ū ���� : �Ű������� 2���� ������
		String names = "������,������~���ü�,����ö.������~������,������";
		StringTokenizer stk1 = new StringTokenizer(names,",~.");
		System.out.println("��ū�� �� : "+stk1.countTokens());
		while (stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken());
		}
		//Ư�����ڷ� ��ū ����, ���е� ���ڿ��� ��ū���� ó�� : �Ű������� 3���� ������
		System.out.println("---------------------------------------");
		StringTokenizer stk2 = new StringTokenizer(names, ",.~", false);
		while (stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken());
		}
		
		
		
		//�������� ���� : �Ű����� �ϳ��� ������ ���.
	}//UseStringTokenizer
	public static void main(String[] args) {

		new UseStringTokenizer();
		
	}//main

}//class
