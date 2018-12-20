package day1122;

/**
 * method�� 4���� ����
 * @author owner
 */
public class MethodType {

	/**
	 * ��ȯ�� ���� �Ű����� ���� �� - ���� ��
	 */
	public void typeA() {
		System.out.println("�ȳ��ϼ���");
	}//typeA
	
	/**
	 * ��ȯ�� ���� �Ű� ���� �ִ� �� - ���� ��
	 * @param i ����ϰ� ���� ��
	 */
	public void typeB(int i) {
		System.out.println(i+"�� �ȳ�");
	}//typeB
	/**
	 * ��ȯ�� �ְ� �Ű����� ���� �� - ���� ��
	 * ���� �޾� ����ϴ� �ڵ尡 �ʿ�.
	 * @return ��.���� �Ǽ������� ��ȯ
	 */
	public float typeC() {
		return (float)2018.11;
//		System.out.println("���� �Ʒ��� �ڵ尡 ���� �� �� ����");
	}//typeC
	
	/**
	 * ��ȯ�� �ְ�, �Ű����� �ִ� ��- ������
	 * @param d ������ ����� ���� �Ǽ���
	 * @return ������ ��ȯ�� ��
	 */
	public int typeD(double d) {
		int i = (int)d;
		return i;
	}//typeD
	
	

	public static void main(String[] args) {
		MethodType mt = new MethodType();
		//1. ������ method ȣ��
		mt.typeA();
		//2. ������ method ȣ��
		mt.typeB(22);
		mt.typeB(202);
		//3. ������ method ȣ�� - ��ȯ���� ��ġ�ϴ� ������ ���� �� ����
		float i = mt.typeC()+1;
		System.out.println("������ "+i);
		//4. ������ method ȣ�� - ��ȯ���� ��ġ�ϴ� ������ ���� �� ����
		int j = mt.typeD(300.003);
		System.out.println("������ "+j);
	}//main

}//class
