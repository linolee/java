package day1127;

//1. 주민번호를 입력받아 처리하는 프로그램
//	각 작업은 method로 정의하고 호출하여 결과를 받아서 처리
//1-1. 생성자는 주민번호를 받아 instance 변수에 할당
//	-인스턴스 변수의 값 사용
//1-2. 주민번호의 길이를 체크하여 14자가 아니면 false를 반환
public class HW1 {
	String SSN = new String();
	int firstYear;
	int lastYear;

	public HW1(String SSN) {
		this.SSN = SSN;
	}// 1.1 생성자 주민번호를 받아 instance 변수에 할당

/*//	public void takeSSN(String input) {
//		SSN = new String(input);
//	}//1.1 takeSSN 주민번호를 받아 instance 변수에 할당
*/
	public boolean checklenSSN() {
		boolean flag = false;
		if (SSN.length() == 14) {
			flag = true;
		}
		return flag;
	}// 1.2 checklenSSN 14자리인지 확인

	public boolean checkhyphenSSN() {
		boolean flag = false;
		if (SSN.charAt(6) == '-') {
			flag = true;
		}
		return flag;
	}// 1.3 checkhyphenSSN 6번째 자리가 -인지 확인

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

	}// 1.4 checkRealSSN 유효성 검증

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
	}// 1.5 returnBirth 생년월일 반환

	public int returnAge() {
		return 2018 - firstYear * 100 - lastYear + 1;
	}// 1.6 returnAge 나이 반환

	public char returnGender() {
		char gender;
		if ((SSN.charAt(7) - '0') % 2 == 1) {
			gender = '남';
		} else {
			gender = '여';
		}
		return gender;
	}// 1.7 returnGender 성별 반환

	public String returnNational() {
		String national = "";
		switch (SSN.charAt(7) - '0') {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 9:
			national = "내국";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			national = "외국";
			break;
		}
		return national;

	}// 1.8 returnNational 국적 반환
	
	public String returnAnimal() {
		String animal = "";
		switch ((firstYear * 100 + lastYear)%12) {
		case 0:
			animal ="원숭이띠";
			break;
		case 1:
			animal ="닭띠";
			break;
		case 2:
			animal ="개띠";
			break;
		case 3:
			animal ="돼지띠";
			break;
		case 4:
			animal ="쥐띠";
			break;
		case 5:
			animal ="소띠";
			break;
		case 6:
			animal ="호랑이띠";
			break;
		case 7:
			animal ="토끼띠";
			break;
		case 8:
			animal ="용띠";
			break;
		case 9:
			animal ="뱀띠";
			break;
		case 10:
			animal ="말띠";
			break;
		case 11:
			animal ="양띠";
			break;
		}
		return animal;
	}//1.9 returnAnimal 띠 반환

}// class
