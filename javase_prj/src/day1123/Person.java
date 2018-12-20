package day1123;

/**
 * 사람을 추상화하여 만든 클래스<br>
 * 명사적 특징 : 눈, 코 ,입, 이름<br>
 * 동사적 특징 : 먹는다<br>
 * <br>
 * 객체화) Person 객체명 = new Person();<br>
 * 생성된 객체로 먹는 일을 할 수 있다.
 * 
 * @author owner
 */
public class Person {
	private String name;// 이름
	private int eye, nose, mouth;// 눈, 코, 입

	/**
	 * 기본 생성자<br>
	 * 
	 */
	public Person() {
		eye = 2;
		nose = 1;
		mouth = 1;
	}
	public Person(int eye, int nose, int mouth) {
		this.eye = eye;
		this.nose = nose;
		this.mouth=mouth;
	}
	/**
	 * 생성된 사람 객체에 이름을 설정하는 일
	 * 
	 * @param name 이름
	 */
	public void setName(String name) {
		this.name = name;
	}// setName

	/**
	 * 생성된 사람 객체에 눈을 설정하는 일 3개 초과는 2개로 설정
	 * 
	 * @param eye 눈의 갯수
	 */
	public void setEye(int eye) {
		if (eye > 3) {
			eye = 2;
		} // end if
		this.eye = eye;
	}// setEye

	/**
	 * 생성된 사람 객체에 코를 설정하는 일
	 * 
	 * @param nose 코의 갯수
	 */
	public void setNose(int nose) {

		this.nose = nose;
	}// setNose

	/**
	 * 생성된 사람 객체에 입을 설정하는 일
	 * 
	 * @param mouth 입의 갯수
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}// setMouth

	/**
	 * @return 이름
	 */
	public String getName() {
		return this.name;
	}// getName

	/**
	 * @return 눈의 갯수
	 */
	public int getEye() {
		return this.eye;
	}// getEye

	/**
	 * @return 코의 갯수
	 */
	public int getNose() {
		return this.nose;
	}// getNose

	/**
	 * @return 입의 갯수
	 */
	public int getMouth() {
		return this.mouth;
	}// getMouth
	
	/**
	 * 생성된 사람 객체가 집에서 밥을 먹는 일 구현
	 * @return 결과
	 */
	public String eat() {
		return name+"이(가) 집에서 밥을 먹는다";
	}//end eat
	
	/**
	 * method overload(overloading) : 다형성 - 같은 이름의 mothod를 여러개 정의하는 방법<br>
	 * 생성된 사람객체가 식다에 주문한 음식을 먹는 일을 구현
	 * @param menu 음식의 종류
	 * @param price 음식 가격
	 * @return 결과
	 */
	public String eat(String menu, int price) {
		return name+"이(가) "+price+"짜리  "+ menu+"을 먹는다";
	}//end eat
	
}//class
