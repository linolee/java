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
		table[0] = new HW1(1, "이재찬", "서울시 강남구 역삼동", 28, "남자");
		table[1] = new HW1(2, "이재현", "서울시 동대문구 답십리동", 27, "남자");
		table[2] = new HW1(3, "김정운", "수원시 영통구 영통동", 26, "남자");
		table[3] = new HW1(4, "정택성", "서울시 구로구 구로동", 27, "남자");
		table[4] = new HW1(5, "정택순", "서울시 동작구 상도동", 29, "여자");
		table[5] = new HW1(6, "김건하", "경기도 부천시 부천동", 26, "남자");
		table[6] = new HW1(7, "이재순", "서울시 광진구 광나루동", 27, "여자");
	}// inputTable

	void printTable() {

		for (int i = 0; i < table.length; i++) {
			System.out.printf("%d, %s, %s, %d, %s\n", table[i].num, table[i].name, table[i].addr, table[i].age,
					table[i].gender);

		} // end for
		System.out.printf("서울시 거주자 %d명\n", CountSeoul());
		System.out.printf("나이합 %d살\n", SumAge());
		PrintMaxAge(ReturnMaxAgeNum());
	}// printTable

	int CountSeoul() {
		int countSeoul = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i].addr.contains("서울시")) {
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
		System.out.printf("최고령자 \"%s(%s)\"\n", table[MaxAgeNum].name, table[MaxAgeNum].gender);
	}// PrintMaxAge

	static void main(String[] args) {
		HW1 hw1 = new HW1();
		hw1.inputTable();
		hw1.printTable();
	}// main

}// class
