package day1119;

/*
 *���� 
1. ����� �ð��� �Է¹޾� �Ʒ��� �������� ����ϼ���.
  ��� :  ����� �ð��� �ִ� 2�ð��� ������ ������ 60���� �Ѵ� �ٸ� "��Ÿ�"
 	 60�� ���϶�� "�ܰŸ�"�� ����ϼ���.

 *
 */
public class HW1 {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]); 
		if (i<= 60) {
		System.out.println("�ܰŸ�");
	}else if (i<= 120) {
		System.out.println("���־�");
	}else {
		System.out.println("��Ÿ�");
	}
		

	}

}
