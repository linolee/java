package day1119;

/**
 * ���ǹ��� ���<br>
 * ���� if�� : ���ǿ� �´� ��쿡�� �ڵ带 �����ؾ� �� ��.<br>
 * ����) if(���ǽ�){<br>
 * ���ǿ� ���� �� ���� �����...;<br>
 * }
 * 
 * @author owner
 */
public class TestIf {
	public final static int FLAG1 = 20;// ���ذ� ��� ����

	public static void main(String[] args) {

		/*
		 * int i = -10;// i�� �Ҵ� if (i < 0) { i = -i; } // end if System.out.println("i="
		 * + i);// ���
		 */
		// �̸��� �Է¹޾� �̸��� "������"�̸� �̸��� ����ϱ� �� "����"�� ����ϰ� �׷��� �ʴٸ� �̸��� ���

		if (args[0].equals("������")) {
			System.out.print("���� ");

		} // end if
		System.out.println(args[0]);

		// ���������� ���ڿ��� ������ ��ȯ
		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);

		System.out.println(i + "+" + j + "=" + (i + j));

		// args[3]�� �Է¹޾� �� ���� 20 ���϶�� 1250�� �Է¼��� ���Ͽ� ����ϰ� �׷��� ������ 20���� ũ�ٸ� 1250�� 10%�� ����
		// ���� �Է¼��� ���Ͽ� ���

		int input3 = Integer.parseInt(args[3]); // �Է¼�
		int multi = 1250; // �Է¼��� ���� ��
		if (input3 > TestIf.FLAG1) {
			multi = (int) (multi * 1.1); // �Է¼��� 20 �ʰ��� �� �Է¼��� ���� ���� 10% �����ֱ�
			System.out.println(input3 * multi); // ���
		}

	}// main
}// class
