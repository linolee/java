package day1123;

/**
 * ��ī���� ������ Ŭ������ ����ϴ� Ŭ����<br>
 * 4.��ü ����<br>
 * 5.������ ��ü ���<br>
 * @author owner
 */
public class UseMarker {

	public static void main(String[] args) {
		//������ ��ī�� 1�� ����
		Marker black = new Marker();
//		black.setColor("������");
//		black.setBody(1);
//		black.setCap(1);
		
		System.out.printf("������ ��ī�� ��[%s], �Ѳ�[%d], ��ü[%d]\n",
				black.getColor(),black.getCap(),black.getBody());
		//������ ��ü�� ���
		System.out.println(black.write("�ȳ��ϼ���"));
		
		Marker Red = new Marker("������", 5, 5);
//		Red.setColor("������");
////		Red.color = "��������";
//		Red.setBody(5);
//		Red.setCap(5);
//		
//		Red.getColor();
//		Red.getBody();
//		Red.getCap();
		
		
		System.out.println(Red.write("���� �̸�"));
	}//main

}//class
