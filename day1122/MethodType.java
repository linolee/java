package day1122;

/**
 * method의 4가지 형태
 * @author owner
 */
public class MethodType {

	/**
	 * 반환형 없고 매개변수 없는 형 - 고정 일
	 */
	public void typeA() {
		System.out.println("안녕하세요");
	}//typeA
	
	/**
	 * 반환형 없고 매개 변수 있는 형 - 가변 일
	 * @param i 출력하고 싶은 값
	 */
	public void typeB(int i) {
		System.out.println(i+"번 안녕");
	}//typeB
	/**
	 * 반환형 있고 매개변수 없는 형 - 고정 값
	 * 값을 받아 사용하는 코드가 필요.
	 * @return 년.월을 실수형으로 반환
	 */
	public float typeC() {
		return (float)2018.11;
//		System.out.println("구문 아래에 코드가 정의 될 수 없다");
	}//typeC
	
	/**
	 * 반환형 있고, 매개변수 있는 형- 가변값
	 * @param d 정수로 만들고 싶은 실수값
	 * @return 정수로 변환된 값
	 */
	public int typeD(double d) {
		int i = (int)d;
		return i;
	}//typeD
	
	

	public static void main(String[] args) {
		MethodType mt = new MethodType();
		//1. 고정일 method 호출
		mt.typeA();
		//2. 가변일 method 호출
		mt.typeB(22);
		mt.typeB(202);
		//3. 고정값 method 호출 - 반환형과 일치하는 변수를 만들어서 값 저장
		float i = mt.typeC()+1;
		System.out.println("고정값 "+i);
		//4. 가변값 method 호출 - 반환형과 일치하는 변수를 만들어서 값 저장
		int j = mt.typeD(300.003);
		System.out.println("가변값 "+j);
	}//main

}//class
