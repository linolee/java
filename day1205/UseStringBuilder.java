package day1205;

/**
 * StringBuffer, StringBuilder(JDK1.5~) ���ڿ��� heap�� �����ϰ� ����ϴ� Ŭ����
 * 
 * @author owner
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		// 1.Ŭ���� ����
		StringBuffer sb = new StringBuffer();
		// 2.���߰�
		sb.append("������ ");// ���ڿ�
		sb.append(12);// ����
		sb.append("�� 5��").append(" �������Դϴ�.");
		System.out.println(sb);
		System.out.println(sb.indexOf("��"));
		// 3.������
		sb.insert(4, "2018�� ");
		System.out.println(sb);
		// 4.������ : delete(�����ε���, ���ε���+1)
		sb.delete(3, 9);
		System.out.println(sb);
	}

	public void useStringBuilder() {
		// 1.Ŭ���� ����
		StringBuilder sb = new StringBuilder();
		// 2.���߰�
		sb.append("������ ");// ���ڿ�
		sb.append(12);// ����
		sb.append("�� 5��").append(" �������Դϴ�.");
		System.out.println(sb);
		System.out.println(sb.indexOf("��"));
		// 3.������
		sb.insert(4, "2018�� ");
		System.out.println(sb);
		// 4.������ : delete(�����ε���, ���ε���+1)
		sb.delete(3, 9);
		System.out.println(sb);
	}

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();

		usb.useStringBuffer();
		System.out.println("================================");
		usb.useStringBuilder();

	}

}