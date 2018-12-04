package day1127;

//1. �ֹι�ȣ�� �Է¹޾� ó���ϴ� ���α׷�
//	�� �۾��� method�� �����ϰ� ȣ���Ͽ� ����� �޾Ƽ� ó��
//1-1. �����ڴ� �ֹι�ȣ�� �޾� instance ������ �Ҵ�
//	-�ν��Ͻ� ������ �� ���
//1-2. �ֹι�ȣ�� ���̸� üũ�Ͽ� 14�ڰ� �ƴϸ� false�� ��ȯ
public class HW1 {
	String SSN = new String();
	int firstYear;
	int lastYear;

	public HW1(String SSN) {
		this.SSN = SSN;
	}// 1.1 ������ �ֹι�ȣ�� �޾� instance ������ �Ҵ�

/*//	public void takeSSN(String input) {
//		SSN = new String(input);
//	}//1.1 takeSSN �ֹι�ȣ�� �޾� instance ������ �Ҵ�
*/
	public boolean checklenSSN() {
		boolean flag = false;
		if (SSN.length() == 14) {
			flag = true;
		}
		return flag;
	}// 1.2 checklenSSN 14�ڸ����� Ȯ��

	public boolean checkhyphenSSN() {
		boolean flag = false;
		if (SSN.charAt(6) == '-') {
			flag = true;
		}
		return flag;
	}// 1.3 checkhyphenSSN 6��° �ڸ��� -���� Ȯ��

	public boolean checkRealSSN() {
		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum = sum + (i + 2) * (SSN.charAt(i) - '0');
		}
		int k = 8;
		for (int i = 7; i < 13; i++, k++) {
			if (k == 10) {
				k = 2;
			}
			sum = sum + k * (SSN.charAt(i) - '0');
		}
		if ((11 - sum % 11) % 10 == (SSN.charAt(13) - '0')) {
			flag = true;
		}
		return flag;

	}// 1.4 checkRealSSN ��ȿ�� ����

	public String returnBirth() {

		switch (SSN.charAt(7) - '0') {
		case 1:
		case 2:
		case 5:
		case 6:
			firstYear = 19;
			break;
		case 0:
		case 9:
			firstYear = 18;
			break;
		default:
			firstYear = 20;
			break;
		}
		lastYear = 10 * (SSN.charAt(0) - '0') + (SSN.charAt(1) - '0');
		return firstYear + "" + lastYear + "-" + SSN.charAt(2) + SSN.charAt(3) + "-" + SSN.charAt(4) + SSN.charAt(5);
	}// 1.5 returnBirth ������� ��ȯ

	public int returnAge() {
		return 2018 - firstYear * 100 - lastYear + 1;
	}// 1.6 returnAge ���� ��ȯ

	public char returnGender() {
		char gender;
		if ((SSN.charAt(7) - '0') % 2 == 1) {
			gender = '��';
		} else {
			gender = '��';
		}
		return gender;
	}// 1.7 returnGender ���� ��ȯ

	public String returnNational() {
		String national = "";
		switch (SSN.charAt(7) - '0') {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 9:
			national = "����";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			national = "�ܱ�";
			break;
		}
		return national;

	}// 1.8 returnNational ���� ��ȯ
	
	public String returnAnimal() {
		String animal = "";
		switch ((firstYear * 100 + lastYear)%12) {
		case 0:
			animal ="�����̶�";
			break;
		case 1:
			animal ="�߶�";
			break;
		case 2:
			animal ="����";
			break;
		case 3:
			animal ="������";
			break;
		case 4:
			animal ="���";
			break;
		case 5:
			animal ="�Ҷ�";
			break;
		case 6:
			animal ="ȣ���̶�";
			break;
		case 7:
			animal ="�䳢��";
			break;
		case 8:
			animal ="���";
			break;
		case 9:
			animal ="���";
			break;
		case 10:
			animal ="����";
			break;
		case 11:
			animal ="���";
			break;
		}
		return animal;
	}//1.9 returnAnimal �� ��ȯ

}// class
