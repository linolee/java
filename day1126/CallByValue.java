package day1126;

/**
 * method�� �Ű������� �⺻������ ���ǵȴٸ� �Ű������� �Ҵ�Ǵ� ���� ����Ǿ� ���޵ȴ�.<br>
 * �Ű������� ���� �����ϴ��� ������ ���� ������� �ʴ´�. (Call by Value)
 * 
 * @author owner
 */
public class CallByValue {

	public void swap(int i, int j) {
		int temp = 0;
		// �ԷµǴ� ������ ���� ���� ����
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap method ������ i= " + i + ", j=" + j);
	}// swap

	public static void main(String[] args) {
		int i = 11, j = 26;
		System.out.println("swap �� i= " + i + ", j=" + j);

		CallByValue cbv = new CallByValue();
		cbv.swap(i, j);
		System.out.println("swap �� i= " + i + ", j=" + j);

	}// main

}// class
