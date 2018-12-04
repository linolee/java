package day1127;

/**
 *
 * @author owner
 */
public class HW2 {
	String SSN = new String();
	int[] arrSSN = new int[13];
	int firstYear;
	int lastYear;
	
	public HW2(String SSN) {
		this.SSN = SSN;
		
		String tempSSN = SSN.replace("-", "");
		for (int i = 0; i<13; i++) {
			arrSSN[i]=tempSSN.charAt(i)-'0';
		}
	}// 1.1 ������ // �ֹι�ȣ�� �޾� instance ������ �Ҵ� + ���ڸ� instance array�� �Ҵ�

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
		for (int i = 0, k = 2; i < arrSSN.length-1; i++, k++) {
			if (k == 10) {
				k = 2;
			}
			sum = sum + k * (arrSSN[i]);
		}
		if ((11 - sum % 11) % 10 == (arrSSN[12])) {
			flag = true;
		}
		return flag;

	}// 1.4 checkRealSSN ��ȿ�� ����

	public String returnBirth() {
		
		switch (arrSSN[6]) {
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
		lastYear = 10 * arrSSN[0] + arrSSN[1];
		return firstYear*100+lastYear+"-"+arrSSN[2]+arrSSN[3]+"-"+arrSSN[4]+arrSSN[5];
	}// 1.5 returnBirth ������� ��ȯ

	public int returnAge() {
		return 2018 - firstYear * 100 - lastYear + 1;
	}// 1.6 returnAge ���� ��ȯ

	public char returnGender() {
		char gender;
		if (arrSSN[6] % 2 == 1) {
			gender = '��';
		} else {
			gender = '��';
		}
		return gender;
	}// 1.7 returnGender ���� ��ȯ

	public String returnNational() {
		String national = "";
		switch (arrSSN[6]) {
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
