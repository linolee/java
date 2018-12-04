package day1126;

/**
 * 클래스가 객체로 생성될 때 기본적으로 가지고 있어야할 기본값을 설정하거나 기본적으로 수행될 코드를 정의하는 method 일종
 * @author owner
 */
public class TestConstructor {
	
	/**
	 * 기본 생성자
	 */
	public TestConstructor() {
//		this(26);
		System.out.println("기본 생성자");
//		TestConstructor(300);//생성자는 method 부르듯 부를 수 없다.
	}//TestConstructor
	
	/**
	 * 인자 있는 생성자
	 * @param i 임의의 값
	 */
	public TestConstructor(int i) {
		this();
		System.out.println("인자 있는 생성자"+i);
//		this();//생성자의 첫번째 줄에서만 사용 가능.
	}//TestConstructor

	public void test() {
		System.out.println("test method!!!");
		temp();//method 호출
	}
	public void temp() {
		System.out.println("=======temp method!!!");
	}
	public static void main(String[] args) {
		new TestConstructor();
		
		
	}//main

}//class
