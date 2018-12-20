package day1128;

/**
 * �ึ�� ���� ������ �ٸ� �����迭
 * 
 * @author owner
 */
public class VariableArray {
	public VariableArray() {
		// 1.����) ��������[][] �迭�� = null;
		int[][] arr = null;
		// 2.����) ���� ������ ���� // �迭�� = new ��������[���� ��][]
		arr = new int[4][];
		// 3.�ึ�� �� ����) �迭��[�� ��ȣ] = new ��������[���� ��]
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[1];
		// �ʱ�ȭ�� �Ϸ��� ���� ������ ���� x
		arr[3] = new int[] { 1, 2, 3, 4, 5, 6 };
		// 4.���Ҵ�
		arr[0][2] = 10;
		arr[1][3] = 20;
		arr[2][0] = 30;
		// 5.�� ���
		System.out.println(arr[0][0] + "/" + arr[0][1] + "/" + arr[0][2]);
		// ��� ���� �� ��� : �ϰ�ó��
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d]=%-5d", i, j, arr[i][j]);
			} // end inner for
			System.out.println();
		} // end outer for
	}// VariableArray

	/**
	 * ���� �迭�� �⺻�� ���� ���
	 */
	public void priType() {
		System.out.println("======================================================");
		// ����)��������[][] �迭�� = {{��,��},{��,��,��,��},{��},{��,��,,,,,,,,},,,,};
		String[][] arr = { { "����" }, { "����", "����", "����", "������" }, { "���", "��", "��" }, { "��" } };
		String[] title = { "��","����","����","�ܿ�"};
		for(int i = 0; i<arr.length;i++) {
			System.out.print(title[i]+" : ");
			for (int j = 0; j<arr[i].length;j++) {
				System.out.printf(arr[i][j]+"\t");
			}//end inner for
			System.out.println();
		}//end outer for
	}// priType

	public static void main(String[] args) {
		new VariableArray().priType();
	}// main

}// class
