package day1123;

/**
 * ����� ��üȭ
 * 
 * @author owner
 */
public class Ramen {
	private String name;
	private int price;
	private double time;
	private int kcal;
	private int nacl;
	private int water;

	public Ramen() {}// �⺻������

	public Ramen(String name, int price, double time, int kcal, int nacl, int water) {
		this.name = name;
		this.price = price;
		this.time = time;
		this.kcal = kcal;
		this.nacl = nacl;
		this.water = water;
	}

	/**
	 * ����� �̸� �Է�
	 * 
	 * @param name ����̸�
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ����� ���� �Է�
	 * 
	 * @param price ��鰡��(��)
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * ��� ���̴� �ð� �Է�
	 * 
	 * @param time ���̴� �ð�(��)
	 */
	public void setTime(double time) {
		this.time = time;
	}

	/**
	 * ����� Į�θ� �Է�
	 * 
	 * @param kcal Į�θ�(kcal)
	 */
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	/**
	 * ����� ��Ʈ�� �Է�
	 * 
	 * @param nacl ��Ʈ��(mg)
	 */
	public void setNacl(int nacl) {
		this.nacl = nacl;
	}

	/**
	 * ��鿡 �ִ� �� �� �Է�
	 * 
	 * @param water �� ��(ml)
	 */
	public void setWater(int water) {
		this.water = water;
	}

	/**
	 * ����̸� ��ȯ
	 * 
	 * @return ����̸�
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * ��� ���� ��ȯ
	 * 
	 * @return ��鰡��
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * ���̴� �ð� ��ȯ
	 * 
	 * @return ���̴� �ð�
	 */
	public double getTime() {
		return this.time;
	}

	/**
	 * ����� Į�θ� ��ȯ
	 * 
	 * @return Į�θ�
	 */
	public int getKcal() {
		return this.kcal;
	}

	/**
	 * ����� ��Ʈ�� ��ȯ
	 * 
	 * @return ��Ʈ��
	 */
	public int getNacl() {
		return this.nacl;
	}

	/**
	 * ��鿡 �ִ� �� �� ��ȯ
	 * 
	 * @return �� ��
	 */
	public int getWater() {
		return this.water;
	}

	/**
	 * ����� ���̴µ� �ʿ��� ���� ��� �����ð��� ǥ��
	 */
	public void Recipe() {
		System.out.printf("%s��(��) �� %dmg�� �ְ� %2.1f�а� ���Դϴ�.\n", name, water, time);
	}

	/**
	 * ����� ����� ǥ��
	 */
	public void Nutrient() {
		System.out.printf("%s��(��) ��Ʈ�� �Է� %dmg, Į�θ� %dKcal�Դϴ�. ���� ��Ʈ�� ���差�� ", name, nacl, kcal);
		System.out.println((double) nacl / (double) 20 + "% �� �ش��մϴ�.");
	}

	public void CanIEat(String... ramen) {

	}
}// class
