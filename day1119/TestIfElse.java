package day1119;

/**
 * if~else : �� �� �ϳ��� �ڵ带 �����ؾ��� �� ���<br>
 * ����) if(���ǽ�){<br>
 * ���ǿ� ���� �� ������ �����;<br>
 * }else{<br>
 * ���ǿ� ���� ���� �� ������ �����<br>
 * }<br>
 * 
 * @author owner
 */
public class TestIfElse {

	public static void main(String[] args) {
		// ������ ����, ������� �Ǵ�
		// ������ Ȧ��, ¦������ �Ǵ�

		int i = -18;
		System.out.print(i + "�� ");
		if (i < 0) {
			System.out.print("����");
		} else {
			System.out.print("���");
		} // end if
			// �����ϴ� ���� �����̶�� {} ���� ����
		System.out.print("�� ");
		if (i % 2 == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		
		//�Է��ϴ� ���� 3�� ������ "¦"�� ����ϰ� �׷��� �ʴٸ� �Է��� ���� ���
		int sam = 27;//3�� ������� Ȯ���� ���� ������ ����
		if(sam%3 == 0) {//3�� ����ΰ�
			System.out.println("¦");//������ "¦" ���
		}else {
			System.out.println(sam);//�ƴ϶�� ������ �״�� ���
		}//end if
		

	}// main

}// class
