package day1126;

/**
 * ���ڿ��� ���� ��
 * 
 * @author owner
 */
public class TestString {

	public static void main(String[] args) {

		String str = "ABC";//�⺻��
		String str1 = new String("ABC");//������

		System.out.println("�⺻�� ==");
		System.out.println(str == "ABC");		//�⺻�� �������� ������ ���ڿ��� ���ڿ� ������� �ּҸ� �����ϱ� ������ == �񱳷� �������� ���� �� ���� �� �� �ִ�.
		System.out.println("������ ==");
		System.out.println(str1 == "ABC");	//������ �������� ������ ���ڿ��� instance ������� �ּҸ� �����ϱ� ������ ==�񱳷� �������� ���� �� ������ �� �� ����.
		System.out.println("������ equals");
		System.out.println(str1.equals("ABC"));	//������ �������� ������ ���ڿ��� �������� ���� �񱳼��� �ϱ� ���ؼ��� equals method�� ����ϸ� �ȴ�.
		System.out.println("�⺻�� equals");
		System.out.println(str.equals("ABC"));	//�翬�� �⺻�� ���Ŀ� equals method�� �����ص� �ȴ�.
	}// main

}// class
