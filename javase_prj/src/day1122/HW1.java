/*���� 
�Ʒ��� ������ ó���ϴ� method�� type�� �˸°� �ۼ��ϰ� API�ּ���
 ������ �� ȣ���Ͽ� ����� �� �� Java Doc�� �����غ�����.
- API�ּ��� � ������ method������ �ּ����� ����Ұ�.

1. �ڽ��� �̸��� ��ȯ�ϴ� method�ۼ�.
2. ���̸� �Է¹޾� �¾ �ظ� ��ȯ�ϴ�  method �ۼ�.
3. ���ڸ� �Է¹޾� �ش� ������ Unicode ���� ��ȯ�ϴ� method �ۼ�.
4. ���ڸ� �Է¹޾� ���ڰ�  ������, ������ ������ ���� �� �ش� ������
    ���ڸ�  ����ϴ� ���� �ϴ� method  �ۼ�
5. ȣ���ϸ� �ڽ��� �ּҸ� ����ϴ�  method �ۼ�.
6. ģ���� �̸��� �Է¹޾� ����ϴ�  method �ۼ�(ģ���� n�� �Դϴ�.) */
package day1122;

/**
 * 11�� 22�� ����
 * 
 * @author owner
 */
public class HW1 {

	/**
	 * 1."�̺���"�� ��ȯ��
	 * 
	 * @return "�̺���"
	 */
	public String ReturnName() {
		return "�̺���";
	}//1. ������

	/**
	 * 2.���̸� �Է¹޾� �¾ �ظ� ��ȯ��
	 * 
	 * @param age ����
	 * @return �¾ ��
	 */
	public int ReturnYear(int age) {
		int year = 2018 - age + 1;
		return year;
	}//2. ������

	/**
	 * 3.���ڸ� �Է¹޾� ���ڿ� �ش��ϴ� �����ڵ带 ��ȯ��
	 * 
	 * @param input ����
	 * @return ���ڿ� �ش��ϴ� �����ڵ�
	 */
	public int ReturnUnicode(char input) {
		return (int) input;
	}//3. ���� ��

	/**
	 * 4.���ڸ� �Է¹޾� ���ڰ� '0'~'9', 'A'~'z'�� �ش��ϴ� �����ڵ��̸� ���ڸ� �����
	 * 
	 * @param input �����ڵ�
	 */
	public void PrintUnicode(int input) {
		if ((input > 47 && input < 58) || (input > 64 && input < 123)) {
			System.out.println((char) input);
		} else {
			System.out.println("48���� 57, 65���� 122 ������ ������ �Է����ּ���.");
		}
	}//4. ���� ��

	/**
	 * 5.�ڽ��� �ּҸ� ����ϴ� method
	 */
	public void PrintAddress() {
		System.out.println("����� ���ı� ������");
	}//5. ���� ��

	/**
	 * 6.ģ�� �̸��� �Է¹޾� �����
	 * 
	 * @param name ģ�� �̸�
	 */
	public void PrintFriends(String... name) {
		for (String names : name) {
			System.out.println(names);
		}
	}//6. ���� ��

	public static void main(String[] args) {
		HW1 hw1 = new HW1();

		System.out.println(hw1.ReturnName());
		// 1.

		System.out.println(hw1.ReturnYear(28));
		// 2.

		System.out.println(hw1.ReturnUnicode('k'));
		// 3.

		hw1.PrintUnicode(69);
		// 4.

		hw1.PrintAddress();
		// 5.

		hw1.PrintFriends("�̺���", "������", "������");
		// 6.
	}// main

}// class
