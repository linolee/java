package day1129;

import java.util.Date;

public class UsePerson {

	public static void main(String[] args) {
		HongGilDong gd = new HongGilDong();
		gd.setName("ȫ�浿");//�θ��� method ���
		System.out.println("�� : "+gd.getEye()+", �� : "+gd.getNose()+", �� : "+gd.getMouth());
		System.out.println(gd.eat());
		System.out.println(gd.eat("����", 1));
		//�ڽŸ��� Ư¡
		System.out.println(gd.fight(6));//7>8
		System.out.println(gd.fight(7));//8>9
		System.out.println(gd.fight(9));//���
		System.out.println(gd.fight(10));//9>8
		System.out.println(gd.fight(9));//8>7
		
		System.out.println("====================================================================");
		Clark superman = new Clark();//�ڽ��� �����Ǹ� �θ�Ŭ������ ���� ������ �� �ڽ��� ����
		//�ڽ��� ��ü�� �θ��� Ŭ������ �ڿ�(����,method)�� �ڽ��� ��ó�� ����� �� �ִ�.
		superman.setName("Ŭ��");
		System.out.println(superman.getEye()+"/"+superman.getNose()+"/"+superman.getMouth()+"/"+superman.getName());
		System.out.println(superman.eat());
		System.out.println(superman.eat("������ũ", 10));
		
		//�ڽ��� method
		String stone = "¯��";
		System.out.println(stone+"��(��) ���� ��� "+superman.power(stone)+", ���� ��ȭ : "+superman.power);
		
		stone = "Ŭ���䳪��Ʈ";
		System.out.println(stone+"��(��) ���� ��� "+superman.power(stone)+", ���� ��ȭ : "+superman.power);
		
		stone = "���̾Ƹ��";
		System.out.println(stone+"��(��) ���� ��� "+superman.power(stone)+", ���� ��ȭ : "+superman.power);
		
		System.out.println("====================================================================");
		BongHyeon bong = new BongHyeon();
		bong.setName("����");
		System.out.println(bong.getName());
		bong.hide();
		bong.sleep();
		System.out.println(bong.getName());
		
		System.out.println(gd);
		
		String s = new String ("������ �ݿ�");
		System.out.println(gd.toString());
		System.out.println(s.toString());
		//���� �����ε� ����� �ٸ� => overriding 
		Date d = new Date();
		System.out.println(d.getYear());
		@SuppressWarnings("unused")
		int i;
	}

}
