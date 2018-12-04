package day1123;

/**
 * ����� �߻�ȭ�Ͽ� ���� Ŭ����<br>
 * ����� Ư¡ : ��, �� ,��, �̸�<br>
 * ������ Ư¡ : �Դ´�<br>
 * <br>
 * ��üȭ) Person ��ü�� = new Person();<br>
 * ������ ��ü�� �Դ� ���� �� �� �ִ�.
 * 
 * @author owner
 */
public class Person {
	private String name;// �̸�
	private int eye, nose, mouth;// ��, ��, ��

	/**
	 * �⺻ ������<br>
	 * 
	 */
	public Person() {
		eye = 2;
		nose = 1;
		mouth = 1;
	}
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth=mouth;
	}
	/**
	 * ������ ��� ��ü�� �̸��� �����ϴ� ��
	 * 
	 * @param name �̸�
	 */
	public void setName(String name) {
		this.name = name;
	}// setName

	/**
	 * ������ ��� ��ü�� ���� �����ϴ� �� 3�� �ʰ��� 2���� ����
	 * 
	 * @param eye ���� ����
	 */
	public void setEye(int eye) {
		if (eye > 3) {
			eye = 2;
		} // end if
		this.eye = eye;
	}// setEye

	/**
	 * ������ ��� ��ü�� �ڸ� �����ϴ� ��
	 * 
	 * @param nose ���� ����
	 */
	public void setNose(int nose) {

		this.nose = nose;
	}// setNose

	/**
	 * ������ ��� ��ü�� ���� �����ϴ� ��
	 * 
	 * @param mouth ���� ����
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}// setMouth

	/**
	 * @return �̸�
	 */
	public String getName() {
		return this.name;
	}// getName

	/**
	 * @return ���� ����
	 */
	public int getEye() {
		return this.eye;
	}// getEye

	/**
	 * @return ���� ����
	 */
	public int getNose() {
		return this.nose;
	}// getNose

	/**
	 * @return ���� ����
	 */
	public int getMouth() {
		return this.mouth;
	}// getMouth
	
	/**
	 * ������ ��� ��ü�� ������ ���� �Դ� �� ����
	 * @return ���
	 */
	public String eat() {
		return name+"��(��) ������ ���� �Դ´�";
	}//end eat
	
	/**
	 * method overload(overloading) : ������ - ���� �̸��� mothod�� ������ �����ϴ� ���<br>
	 * ������ �����ü�� �Ĵٿ� �ֹ��� ������ �Դ� ���� ����
	 * @param menu ������ ����
	 * @param price ���� ����
	 * @return ���
	 */
	public String eat(String menu, int price) {
		return name+"��(��) "+price+"¥��  "+ menu+"�� �Դ´�";
	}//end eat
	
}//class
