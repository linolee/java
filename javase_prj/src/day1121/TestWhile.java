package day1121;

/**
 * while : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 * �ּ� 0�� ���� �ִ� ���Ǳ��� ����<br>
 * ����) while(���ǽ�){<br>
 * �ݺ����๮��;<br>
 * }
 * 
 * @author owner
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 100;// �ʱⰪ

		while (i < 10) {
			System.out.println("i=" + i);
			i++;// ������
		}
		System.out.println("=====================");

		// ���� �Է¹޾� 2~9�� ���̶�� �������� ��� (while ���)
		if (Integer.parseInt(args[0]) > 1 && Integer.parseInt(args[0]) < 10) {
			int j = 1;
			while (j < 10) {
				System.out.println(Integer.parseInt(args[0]) + "x" + j + "=" + Integer.parseInt(args[0]) * j);
				j++;
			} // end while
		} else {
			System.out.println("2~9 ���� �Է��ϼ���");
		} // end if
		
		
	}// main

}// class
