/*숙제 
아래의 업무를 처리하는 method를 type에 알맞게 작성하고 API주석을
 설정한 후 호출하여 결과를 본 후 Java Doc을 생성해보세요.
- API주석은 어떤 형태의 method인지를 주석으로 기술할것.

1. 자신의 이름을 반환하는 method작성.
2. 나이를 입력받아 태어난 해를 반환하는  method 작성.
3. 문자를 입력받아 해당 문자의 Unicode 값을 반환하는 method 작성.
4. 숫자를 입력받아 숫자가  영문자, 숫자의 범위에 있을 때 해당 숫자의
    문자를  출력하는 일을 하는 method  작성
5. 호출하면 자신의 주소를 출력하는  method 작성.
6. 친구의 이름을 입력받아 출력하는  method 작성(친구는 n명 입니다.) */
package day1122;

/**
 * 11월 22일 숙제
 * 
 * @author owner
 */
public class HW1 {

	/**
	 * 1."이봉현"을 반환함
	 * 
	 * @return "이봉현"
	 */
	public String ReturnName() {
		return "이봉현";
	}//1. 고정값

	/**
	 * 2.나이를 입력받아 태어난 해를 반환함
	 * 
	 * @param age 나이
	 * @return 태어난 해
	 */
	public int ReturnYear(int age) {
		int year = 2018 - age + 1;
		return year;
	}//2. 가변값

	/**
	 * 3.문자를 입력받아 문자에 해당하는 유니코드를 반환함
	 * 
	 * @param input 문자
	 * @return 문자에 해당하는 유니코드
	 */
	public int ReturnUnicode(char input) {
		return (int) input;
	}//3. 가변 값

	/**
	 * 4.숫자를 입력받아 숫자가 '0'~'9', 'A'~'z'에 해당하는 유니코드이면 문자를 출력함
	 * 
	 * @param input 유니코드
	 */
	public void PrintUnicode(int input) {
		if ((input > 47 && input < 58) || (input > 64 && input < 123)) {
			System.out.println((char) input);
		} else {
			System.out.println("48에서 57, 65에서 122 사이의 정수를 입력해주세요.");
		}
	}//4. 가변 일

	/**
	 * 5.자신의 주소를 출력하는 method
	 */
	public void PrintAddress() {
		System.out.println("서울시 송파구 장지동");
	}//5. 고정 일

	/**
	 * 6.친구 이름을 입력받아 출력함
	 * 
	 * @param name 친구 이름
	 */
	public void PrintFriends(String... name) {
		for (String names : name) {
			System.out.println(names);
		}
	}//6. 가변 일

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

		hw1.PrintFriends("이봉현", "이재찬", "공선의");
		// 6.
	}// main

}// class
