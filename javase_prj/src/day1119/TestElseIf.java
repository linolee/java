package day1119;

/**
 * else~if : ������ ���������� ���� ��.<br>
 * ����) if(���ǽ�){<br>
 * ���ǿ� ���� �� ������ �����;<br>
 * }else if(���ǽ�){<br>
 * ���ǿ� ���� �� ������ �����;<br>
 * }else if(���ǽ�){<br>
 * ���ǿ� ���� �� ������ �����;<br>
 * }else {<br>
 * ���ǿ� ���� ���� �� ������ �����;<br>
 * }<br>
 * 
 * @author owner
 */
public class TestElseIf {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		System.out.print(i + "��(��) ");
		if (i < 0) {
			System.out.println("0���� �۾Ƽ� �Է½���");
		} else if (i > 100) {
			System.out.println("100���� Ŀ�� �Է½���");
		} else {
			System.out.println("�Է� ����");
		} // end if

		// �̸��� �Է¹޾� "������"�̸� ������ �̺���, �ڿ���, ������, �������̸� ����, �׷��� ������ ����� �̸� �տ� ���
		if (args[1].equals("������")) {
			System.out.println("����");
		} else if (args[1].equals("�̺���") || args[1].equals("�ڿ���") || args[1].equals("������") || args[1].equals("������")) {
			System.out.println("����");
		} else {
			System.out.println("���");
		} // end if
		System.out.println(args[1] + "�� �ȳ��ϼ���.");

		// �¾ �ظ� �Է¹޾� �� ���ϱ�
		int j = Integer.parseInt(args[2]);
		int k = (j % 12);
		if (k == 0) {
			System.out.println("������");
		} else if (k == 1) {
			System.out.println("��");
		} else if (k == 2) {
			System.out.println("��");
		} else if (k == 3) {
			System.out.println("����");
		} else if (k == 4) {
			System.out.println("��");
		} else if (k == 5) {
			System.out.println("��");
		} else if (k == 6) {
			System.out.println("ȣ����");
		} else if (k == 7) {
			System.out.println("�䳢");
		} else if (k == 8) {
			System.out.println("��");
		} else if (k == 9) {
			System.out.println("��");
		} else if (k == 10) {
			System.out.println("��");
		} else if (k == 11) {
			System.out.println("��");
		} else {
			System.out.println("�ùٸ� ���� �Է��� �ּ���.");
		}
		// end if

	}// main

}// class
