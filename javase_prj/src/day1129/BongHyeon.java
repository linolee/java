package day1129;


public class BongHyeon extends Person {
	public void hide() {
		System.out.println("�����");
	}
	public void sleep() {
		int flag;
		flag = (int)(Math.random()*100);
		
		if (flag > 70) {
			System.out.println("������� ���� ���� ������ ���ߴ�.");
			setName("������� ���� ����");
		}else {
			System.out.println("���� ���� ���ߴ�.");
			setName("�ǰ��� ����");
		}
	}
}
