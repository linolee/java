package day1122;

/**
 * Variable Arguments<br>
 * 매개변수는 하나인데 인수를 여러개 넣을 수 있는 기능.<br>
 * method 내에서는 배열로 처리된다.<br>
 * 정의)"데이터형 ... parameter명"형식으로 정의<br>
 * 
 * @author owner
 */
public class VariableArguments {
	/**
	 * 동일 데이터형으로 된 입력값을 여러개 새용할 때
	 * 
	 * @param param 가변인자형
	 */
	public void test(int... param) {
		for (int val : param) {
			System.out.println(val);
		} // end for
	}// test

	/**
	 * 가변 인수를 받기위한 변수는 가장 마지막에만 넣을 수 있다.
	 * 
	 * @param i 정수
	 * @param d 실수
	 * @param j 정수
	 */
	public void test1(int i, double d, int... j) {
		System.out.println("처음 매개변수 : " + i);
		System.out.println("두번째 매개변수 : " + d);
		System.out.println("세번째 매개변수 : " + j);
		for (int idx = 0; idx < j.length; idx++) {
			System.out.println(j[idx]);
		} // end for
	}// test
		// 문자열을 입력받을 수 있는 매개변수를 사용

	public void printName(String name) {
		System.out.println(name);
	}// printName

	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.test(1, 2, 3, 4, 54, 3, 123, 12, 41, 23, 12, 42135, 123, 1234);
//		va.test(1, 1.1, 1);
		va.test1(1, 3.14, 10, 20, 30);
		String name = "ㅁㄴㅇㄻㄴㅇㄹ";
		va.printName(name);

	}// main

}// class
