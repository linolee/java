package day1123;

/**
 * 마카펜을 대상으로 선정하여, 추상화를 진행하고 만들어진 클래스<br>
 * 마카펜 - 명사적 특징 : 색, 몸체, 뚜껑 → 변수<br>
 * 동사적 특징 : 쓴다 → method<br>
 * 사용법)<br>
 * 기본생성자를 사용하여 객체를 생성한 후 setter method를 호출하여 값을 설정하고 사용한다.<br>
 * Marker m = new Marker();<br>
 * m.setXxx(값);<br>
 * 
 * class는 사용자 정의 자료형, 참조형 데이터형이다. <br>
 * 
 * @author owner
 */
public class Marker {
	private String color;// 마카펜 색
	private int body;// 마카펜 몸체 갯수
	private int cap; // 마카펜 뚜껑 갯수

	/**
	 * 기본 생성자로 마카펜 객체가 생성되면 검은색, 몸체 1개 뚜껑 1개인 객체를 생성<br>
	 * 11-26-2018 코드 추가
	 */
	public Marker() {
		color = "검은색";
		body = 1;
		cap = 1;
	}//Marker
	/**
	 * 인자 있는 생성자 - 색, 뚜껑의 수, 몸체의 수를 입력받아 마카펜을 생성하는 생성자
	 * @param color 마카펜의 색
	 * @param cap 마카펜 뚜껑 갯수
	 * @param body 마카펜 몸체 갯수
	 */
	public Marker(String color, int cap, int body) {
		this.color = color;
		this.cap = cap;
		this.body= body;				
	}//Marker
	/**
	 * 생성된 마카펜 객체에 색을 설정하는 일<br>
	 * 검은색, 파란색, 빨간색만 설정. 그 이외의 색은 검은색으로 처리
	 * 
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		// 인스턴스 변수에 설정될 값에 대한 검증 수행.
		if (color.equals("파란색") || color.equals("빨간색")) {
			this.color = color;
		} else {
			this.color = "검은색";
		} // end if
	}// setColor

	/**
	 * 생성된 마카펜 객체의 몸체의 갯수를 설정하는 일
	 * @param body 몸체 갯수
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	/**
	 * 생성된 마카펜 객체의 뚜껑의 갯수를 설정하는 일
	 * @param cap 뚜껑 갯수
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}//setCap
	/**
	 * 
	 * 생성된 마카펜 객체가 가진 색
	 * @return 색
	 */
	public String getColor() {
		return color;
	}//getColor
	/**
	 * 생성된 마카펜 객체가 가진 몸통의 갯수
	 * @return 몸통의 갯수
	 */
	public int getBody() {
		return body;
	}//getBody
	/**
	 * 생성된 마카펜 객체가 가진 몸통의 갯수
	 * @return 뚜껑의 갯수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	public String write(String msg) {
		return color+"인 마카펜으로 칠판에 "+msg+"를 쓴다.";  
	}//write
}//Marker
