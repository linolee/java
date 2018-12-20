package day1122;

/**
 * Variable Arguments<br>
 * �Ű������� �ϳ��ε� �μ��� ������ ���� �� �ִ� ���.<br>
 * method �������� �迭�� ó���ȴ�.<br>
 * ����)"�������� ... parameter��"�������� ����<br>
 * 
 * @author owner
 */
public class VariableArguments {
	/**
	 * ���� ������������ �� �Է°��� ������ ������ ��
	 * 
	 * @param param ����������
	 */
	public void test(int... param) {
		for (int val : param) {
			System.out.println(val);
		} // end for
	}// test

	/**
	 * ���� �μ��� �ޱ����� ������ ���� ���������� ���� �� �ִ�.
	 * 
	 * @param i ����
	 * @param d �Ǽ�
	 * @param j ����
	 */
	public void test1(int i, double d, int... j) {
		System.out.println("ó�� �Ű����� : " + i);
		System.out.println("�ι�° �Ű����� : " + d);
		System.out.println("����° �Ű����� : " + j);
		for (int idx = 0; idx < j.length; idx++) {
			System.out.println(j[idx]);
		} // end for
	}// test
		// ���ڿ��� �Է¹��� �� �ִ� �Ű������� ���

	public void printName(String name) {
		System.out.println(name);
	}// printName

	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.test(1, 2, 3, 4, 54, 3, 123, 12, 41, 23, 12, 42135, 123, 1234);
//		va.test(1, 1.1, 1);
		va.test1(1, 3.14, 10, 20, 30);
		String name = "��������������";
		va.printName(name);

	}// main

}// class
