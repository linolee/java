package day1203;

/**
 * 사람을 추상화하여 만든 클래스<br>
 * 명사적 특징 : 눈, 코 ,입, 이름<br>
 * 동사적 특징 : 먹는다<br>
 * <br>
 * 객체화) Person 객체명 = new Person();<br>
 * 생성된 객체로 먹는 일을 할 수 있다.<br>
 * 
 * Person을 일반클래스에서 abstract클래스로 변경<br>
 * 모든 사람의 집에서 먹는 일과 밖에서 사먹는일, 언어를 반드시 가진다.
 * 
 * @author owner
 */
public abstract class Person {
	private String name;// 이름
	private int eye, nose, mouth;// 눈, 코, 입
	private String[] langauage;
	
	
	public String[] language(String lang) {
		String[] tempLang = getLanguage();
		return tempLang;
	}
	
	/**
	 * 기본 생성자<br>
	 * 
	 */
	public Person() {
		this(2,1,1);
//		eye = 2;
//		nose = 1;
//		mouth = 1;
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
	
	public String[] getLanguage() {
		return langauage;
	}
	
	/**
	 * 생성된 사람 객체가 집에서 밥을 먹는 일 구현
	 * @return 결과
	 */
	public abstract String eat();//end eat
	
	/**
	 * method overload(overloading) : 다형성 - 같은 이름의 mothod를 여러개 정의하는 방법<br>
	 * 생성된 사람객체가 식다에 주문한 음식을 먹는 일을 구현
	 * @param menu 음식의 종류
	 * @param price 음식 가격
	 * @return 결과
	 */
	public abstract String eat(String menu, int price);//end eat
	
	/**
	 * 사람은 언어를 여러개 할 수 있다.
	 * @return 할 수 잇는 언어
	 */
	public abstract String[] language();
}//class
