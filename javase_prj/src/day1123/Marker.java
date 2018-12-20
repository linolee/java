package day1123;

/**
 * ��ī���� ������� �����Ͽ�, �߻�ȭ�� �����ϰ� ������� Ŭ����<br>
 * ��ī�� - ����� Ư¡ : ��, ��ü, �Ѳ� �� ����<br>
 * ������ Ư¡ : ���� �� method<br>
 * ����)<br>
 * �⺻�����ڸ� ����Ͽ� ��ü�� ������ �� setter method�� ȣ���Ͽ� ���� �����ϰ� ����Ѵ�.<br>
 * Marker m = new Marker();<br>
 * m.setXxx(��);<br>
 * 
 * class�� ����� ���� �ڷ���, ������ ���������̴�. <br>
 * 
 * @author owner
 */
public class Marker {
	private String color;// ��ī�� ��
	private int body;// ��ī�� ��ü ����
	private int cap; // ��ī�� �Ѳ� ����

	/**
	 * �⺻ �����ڷ� ��ī�� ��ü�� �����Ǹ� ������, ��ü 1�� �Ѳ� 1���� ��ü�� ����<br>
	 * 11-26-2018 �ڵ� �߰�
	 */
	public Marker() {
		color = "������";
		body = 1;
		cap = 1;
	}//Marker
	/**
	 * ���� �ִ� ������ - ��, �Ѳ��� ��, ��ü�� ���� �Է¹޾� ��ī���� �����ϴ� ������
	 * @param color ��ī���� ��
	 * @param cap ��ī�� �Ѳ� ����
	 * @param body ��ī�� ��ü ����
	 */
	public Marker(String color, int cap, int body) {
		this.color = color;
		this.cap = cap;
		this.body= body;				
	}//Marker
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��<br>
	 * ������, �Ķ���, �������� ����. �� �̿��� ���� ���������� ó��
	 * 
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		// �ν��Ͻ� ������ ������ ���� ���� ���� ����.
		if (color.equals("�Ķ���") || color.equals("������")) {
			this.color = color;
		} else {
			this.color = "������";
		} // end if
	}// setColor

	/**
	 * ������ ��ī�� ��ü�� ��ü�� ������ �����ϴ� ��
	 * @param body ��ü ����
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ� ��
	 * @param cap �Ѳ� ����
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	/**
	 * 
	 * ������ ��ī�� ��ü�� ���� ��
	 * @return ��
	 */
	public String getColor() {
		return color;
	}//getColor
	/**
	 * ������ ��ī�� ��ü�� ���� ������ ����
	 * @return ������ ����
	 */
	public int getBody() {
		return body;
	}//getBody
	/**
	 * ������ ��ī�� ��ü�� ���� ������ ����
	 * @return �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	public String write(String msg) {
		return color+"�� ��ī������ ĥ�ǿ� "+msg+"�� ����.";  
	}//write
}//Marker
