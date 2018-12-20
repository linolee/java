package day1127;

/**
 * ���ڿ� ������� �ּҸ� �����ϰ�, ���ڿ��� �ٷ�� ����� �����ϴ� String class�� ���<br>
 * java���� �����ϴ� Ŭ������ �̸��� ���� ���� Ŭ������ �̸��� ���ٸ� ���� ���� Ŭ������ ���� ����ϰ� �ȴ�.<br>
 * java���� �����ϴ� Ŭ������ ����� �� ���� "full path : ��Ű������ ��� ����Ͽ� Ŭ������ ����ϴ°�"�� ����ؾ�
 * �Ѵ�.<br>
 * 
 * @author owner
 */
public class UseString {

	public static void main(java.lang.String[] args) {
		// �⺻�� ���� ���. String s="���ڿ�";
		String str = "AbcdEfg";
		// ������ ���� ��� String s = new String("���ڿ�");
		String mail = new String("linolee@naver.com");

		System.out.println(str + "�� ���� " + str.length());
		System.out.println(mail + "�� ���� " + mail.length());

		System.out.println(str + "�� ��� �빮�ڷ� : " + str.toUpperCase());
		System.out.println(str + "�� ��� �ҹ��ڷ� : " + str.toLowerCase());

		System.out.println(str + "���� 'd'�� �ε��� : " + str.indexOf("d"));
		System.out.println(str + "���� 'z'�� �ε��� : " + str.indexOf("z"));
		System.out.println(mail + "���� \"@\"�� �ε��� : " + mail.indexOf("@"));
		
		str = "AbcdEfAg";
		
		System.out.println(str+ "���� ���� ������ A�� �ε��� : "+str.lastIndexOf("A"));
		
		System.out.println(str+"���� �ε��� 2�� �ش��ϴ� ���� : "+str.charAt(2));
//		System.out.println(str+"���� �ε��� 2�� �ش��ϴ� ���� : "+str.charAt(200));//index�� ���� �ʰ��ϹǷ� Error
		
		System.out.println(mail+"���� ���̵� : "+ mail.substring(0, mail.indexOf("@")));
		System.out.println(mail+"���� ������ : "+ mail.substring(mail.indexOf("@")+1));
		
		str = "   A BC   ";
		System.out.println(str+"���� �յ� ���� ���� : ["+ str.trim()+"]");
		
		str = "Abcd";
		String str1 = str.concat("Efg");
		System.out.println(str+"+"+"Efg = "+str1);
		
		str = "������";
		System.out.println(str + "��(��)" +(str.equals("������")?"����":"���"));
		str = "���ü�";
		System.out.println(str + "��(��)" +(str.equals("������")?"����":"���"));
		
		str = "�Ǿ���";
		if (str.startsWith("����")) {
			System.out.println("���� ����Ͻ� �� �����ϴ�.");
		}else {
			System.out.println(str);
		}//end if
				
		str = "����� ������";
		
		if (str.startsWith("�����")) {
			System.out.println("���� �̳�");
		}else {
			System.out.println("�̳�");
		}//end if
		
		str = "���׽� ������";
		
		if (str.startsWith("�����")) {
			System.out.println("���� �̳�");
		}else {
			System.out.println("�̳�");
		}//end if
		
		if (str.endsWith("��")) {
			System.out.println("�����̳�");
		}else if(str.endsWith("��")){
			System.out.println("�̳�");
		}else if(str.endsWith("��")){
			System.out.println("���̳�");
		}//end if
		
		str="�� ���� �Ǿ����ε� �� ���� �� �����!";
		
//		System.out.println(str.replaceAll("����", "**"));
		System.out.println(str.replaceAll("��", "*").replaceAll("��", "*"));//method chain
		
		str = "  A BC  ";
		System.out.println(str.replaceAll(" ", ""));
		
		int i = 27;
		str = String.valueOf(i);
		System.out.println(str+3);
		double d = 12.27;
		str = d+"";
		System.out.println(str+3);
		str = "";
		System.out.println(str.isEmpty());
		
		//��ü ������ ���� �ʾ��� �� �� Ŭ������ �����ϴ� method�� ����� �� ����.//error
//		str=null;
//		System.out.println(str.isEmpty());
		
		////////////////////11-28-2018 split ����ڵ� �߰�/////////////////////////
		//split�� �ѹ��� �ϳ��� ���ڷ� �����Ͽ� �ڸ���.
		String data = "������,������,���ü�~������~�����.������,������,������.������";
		String[] arr = data.split("[.]");//.�� �׳� ���� ���е��� �ʰ� []��� ����.
		System.out.println("���е� �迭 ���� ���� : "+ arr.length);
		for (String name : arr) {
			System.out.println(name);
		}
		

		
		
	}// main

}// class
