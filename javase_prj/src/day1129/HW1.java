package day1129;

public class HW1 {
	private int num;
	private String name;
	private String addr;
	private int age;
	private String gender;
	private HW1[] table = null;

	public HW1() {
	}

	public HW1(int num, String name, String addr, int age, String gender) {
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.gender = gender;
	}

	void inputTable() {
		table = new HW1[7];
		table[0] = new HW1(1, "������", "����� ������ ���ﵿ", 28, "����");
		table[1] = new HW1(2, "������", "����� ���빮�� ��ʸ���", 27, "����");
		table[2] = new HW1(3, "������", "������ ���뱸 ���뵿", 26, "����");
		table[3] = new HW1(4, "���ü�", "����� ���α� ���ε�", 27, "����");
		table[4] = new HW1(5, "���ü�", "����� ���۱� �󵵵�", 29, "����");
		table[5] = new HW1(6, "�����", "��⵵ ��õ�� ��õ��", 26, "����");
		table[6] = new HW1(7, "�����", "����� ������ �����絿", 27, "����");
	}// inputTable

	void printTable() {

		for (int i = 0; i < table.length; i++) {
			System.out.printf("%d, %s, %s, %d, %s\n", table[i].num, table[i].name, table[i].addr, table[i].age,
					table[i].gender);

		} // end for
		System.out.printf("����� ������ %d��\n", CountSeoul());
		System.out.printf("������ %d��\n", SumAge());
		PrintMaxAge(ReturnMaxAgeNum());
	}// printTable

	int CountSeoul() {
		int countSeoul = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i].addr.contains("�����")) {
				countSeoul++;
			} // end if
		} // end for
		return countSeoul;
	}// CountSeoul

	int SumAge() {
		int sumAge = 0;
		for (int i = 0; i < table.length; i++) {
			sumAge = sumAge + table[i].age;
		} // end for
		return sumAge;
	}// SumAge

	int ReturnMaxAgeNum() {
		int AgeMax = 0;
		int MaxAgeNum = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i].age > AgeMax) {
				AgeMax = table[i].age;
				MaxAgeNum = i;
			}
		}
		return MaxAgeNum;
	}// ReturnMaxAgeNum

	void PrintMaxAge(int MaxAgeNum) {
		System.out.printf("�ְ���� \"%s(%s)\"\n", table[MaxAgeNum].name, table[MaxAgeNum].gender);
	}// PrintMaxAge

	static void main(String[] args) {
		HW1 hw1 = new HW1();
		hw1.inputTable();
		hw1.printTable();
	}// main

}// class
