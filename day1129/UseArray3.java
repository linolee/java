package day1129;

/**
 * 3���� ��� (��, ��, ��)
 * 
 * @author owner
 */
public class UseArray3 {
	public UseArray3() {
		// 3���� �迭 ������ ��� ���
		// 1.���� : ��������[][][] �迭�� = null; �������� �迭��[][][] = null;
		int[][][] arr = null;
		// 2.���� : �迭�� = new ��������[���� ��][���� ��][���� ��]
		arr = new int[2][3][4];
		// 1+2. ��������[][][]�迭�� = new ��������[��][��][��];
		int[][][] arr1 = new int[3][4][5];
		// 3.���Ҵ� : �迭��[��][��][��] = ��;
		arr[0][0][0] = 10;
		arr[1][2][3] = 1000;
		// 4.����� : �迭��[��][��][��];
		System.out.println(arr[0][0][0] + "/" + arr[0][0][1] + "/" + arr[0][0][2]);
		System.out.println("���� �� : " + arr.length + ", ���� �� : " + arr[0].length + ", ���� �� : " + arr[0][0].length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("==========================");
			System.out.printf("%d��\n", i);

			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d��\n", j);
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%d\t", arr[i][j][k]);
				}
				System.out.println("\n-------------------------");
			}
			System.out.println("==========================");
		}
		System.out.println("���������ο���������������������");
		for (int[][] temparr0 : arr1) {
			for (int[] temparr1 : temparr0) {
				for (int temparr2 : temparr1) {
					System.out.printf("%d\t", temparr2);
				}
				System.out.println();
			}
			System.out.println();
		}
	}// UseArray3

	public void priType() {
		// �⺻�� �������� 3���� �迭����
		// ��������[][][]�迭�� =
		// {{{��,,}{,,,},,,,,,,,}{��,,}{,,,},,,,,,,,}{��,,}{,,,},,,,,,,,},,,,,,,,}
		int[][][] arr = { { { 1, 2 }, { 3, 4 }, { 5, 6 } }, { { 7, 8 }, { 9, 10 }, { 11, 12 } } };
		System.out.println(arr.length + "/" + arr[0].length + "/" + arr[0][0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.printf("%d\t",arr[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}// priType
	
	
	public static void main(String[] args) {
		new UseArray3().priType();
		
	}// main

}// class
